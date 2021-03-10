package rest.server;

import java.util.ArrayList;

public class Depot_ {
	private int depotNr;
	double gesBetragDepot;
	ArrayList<Position1> position;

	public Depot_() {

	}

	public Depot_(int depotNr, ArrayList<Position1> position) {
		this.depotNr = depotNr;
		this.position = position;
	}

	public int getDepotNr() {
		return depotNr;
	}

	public void setDepotNr(int depotNr) {
		this.depotNr = depotNr;
	}

	public ArrayList<Position1> getPosition() {
		return position;
	}

	public void setPosition(ArrayList<Position1> position) {
		this.position = position;
	}

	public double getGesBetragDepot() {
		return gesBetragDepot;
	}

	public void setGesBetragDepot(double gesBetragDepot) {
		this.gesBetragDepot = gesBetragDepot;
	}

	@Override
	public String toString() {
		return "Depot_ [depotNr=" + depotNr + ", gesBetragDepot=" + gesBetragDepot + ", position=" + position + "]";
	}

}
