package rest.server;

import java.util.ArrayList;

public class Depot_1 {
	private int depotNr;
	double depotBetrag;
	ArrayList<Double> position;

	public Depot_1() {

	}

	public Depot_1(int depotNr, double gesBetragDepot, ArrayList<Double> position) {
		this.depotNr = depotNr;
		this.depotBetrag = gesBetragDepot;
		this.position = position;
	}

	public int getDepotNr() {
		return depotNr;
	}

	public void setDepotNr(int depotNr) {
		this.depotNr = depotNr;
	}

	public double getDepotBetrag() {
		return depotBetrag;
	}

	public void setDepotBetrag(double depotBetrag) {
		this.depotBetrag = depotBetrag;
	}

	public ArrayList<Double> getPosition() {
		return position;
	}

	public void setPosition(ArrayList<Double> position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Depot_1 [depotNr=" + depotNr + ", depotBetrag=" + depotBetrag + ", position=" + position + "]";
	}

}
