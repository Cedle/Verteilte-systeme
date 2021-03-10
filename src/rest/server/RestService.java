package rest.server;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
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

@Path("kunde")
public class RestService {

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("{kundenNummer}")
	public Kunde getKunde(@PathParam("kundenNummer") int kundenNummer) {

		// Import Services
		CustomerServiceService cslookup = new CustomerServiceService();
		CustomerService cs = cslookup.getCustomerServicePort();
		DepotServiceService dslookup = new DepotServiceService();
		DepotService ds = dslookup.getDepotServicePort();
		PriceServiceService pslookup = new PriceServiceService();
		PriceService ps = pslookup.getPriceServicePort();

		Customer kunde = cs.getCustomer(kundenNummer);

		List<Depot> depotListService = ds.getDepot(kundenNummer);
		ArrayList<Depot_1> depotList = new ArrayList<Depot_1>();
		for (Depot depotService : depotListService) {
			int depNr = depotService.getDepotNumber();

			List<Position> pos = depotService.getPositions();

			ArrayList<Double> positionen = new ArrayList<Double>();
			for (Position p : pos) {
				double betrag = p.getAmount();
				double umrechnungsfaktor = ps.getExchangeRate(p.getCurrency(), kunde.getCurrency());
				double posBetrag = betrag * umrechnungsfaktor;
				double posBetragRound = Math.round(posBetrag * 100.0) / 100.0;
				positionen.add(posBetragRound);
			}

			double depotBetrag = 0;
			for (Double d : positionen) {
				depotBetrag = depotBetrag + d;
			}

			Depot_1 dep1 = new Depot_1();
			dep1.setPosition(positionen);
			dep1.setDepotBetrag(depotBetrag);
			dep1.setDepotNr(depNr);
			depotList.add(dep1);
		}
		double gesBetrag = 0;
		for (Depot_1 depot : depotList) {
			gesBetrag = gesBetrag + depot.getDepotBetrag();
		}

		// Erstellung des Kunden
		Kunde k = new Kunde();
		k.setName(kunde.getFirstName() + " " + kunde.getSurName());
		k.setDepots(depotList);
		k.setVermoegen(gesBetrag);

		return k;
	}
}