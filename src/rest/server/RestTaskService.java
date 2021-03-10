package rest.server;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import customerservice.gen.Customer;
import customerservice.gen.CustomerService;
import customerservice.gen.CustomerServiceService;
import depotservice.gen.Depot;
import depotservice.gen.DepotService;
import depotservice.gen.DepotServiceService;
import depotservice.gen.Position;
import priceservice.gen.PriceService;
import priceservice.gen.PriceServiceService;

@Path("kundenservice")
public class RestTaskService {
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("kunde/{kundenNummer}")
	public Client getKunde(@PathParam("kundenNummer") int kundenNummer) {

		CustomerServiceService cslookup = new CustomerServiceService();
		CustomerService cs = cslookup.getCustomerServicePort();
		DepotServiceService dslookup = new DepotServiceService();
		DepotService ds = dslookup.getDepotServicePort();
		PriceServiceService pslookup = new PriceServiceService();
		PriceService ps = pslookup.getPriceServicePort();
		Customer kunde = cs.getCustomer(kundenNummer);
		Client c = new Client();
		c.setKundennummer(kundenNummer);
		c.setKundenVorname(kunde.getFirstName());
		c.setKundenNachname(kunde.getSurName());
		List<Depot> depList = ds.getDepot(kundenNummer);
		ArrayList<Depot_> dep_ = new ArrayList<Depot_>();
		for (Depot depot : depList) {
			int depNr = depot.getDepotNumber();
			List<Position> pos = depot.getPositions();
			ArrayList<Position1> pos1 = new ArrayList<Position1>();
			for (Position pos_ : pos) {
				double amount = pos_.getAmount();
				String currency = pos_.getCurrency();
				double umrechnung = ps.getExchangeRate(currency, kunde.getCurrency());
				double betrag = amount * umrechnung;
				Position1 po = new Position1();
				po.setEndbetrag(betrag);
				pos1.add(po);
			}
			double gesDepotBetrag = 0;
			for (Position1 p : pos1) {
				gesDepotBetrag = gesDepotBetrag + p.getEndbetrag();
			}

			Depot_ dep1 = new Depot_();
			dep1.setPosition(pos1);
			dep1.setGesBetragDepot(gesDepotBetrag);
			dep1.setDepotNr(depNr);
			dep_.add(dep1);
		}
		double gesBetrag = 0;
		for (Depot_ depot_ : dep_) {
			gesBetrag = gesBetrag + depot_.getGesBetragDepot();
		}
		c.setDepots(dep_);
		c.setGesVermoegen(gesBetrag);
		return c;
	}
}
