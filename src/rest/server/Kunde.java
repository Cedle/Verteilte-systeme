package rest.server;

import java.util.ArrayList;

public class Kunde {
	private String Name;
	private double Vermoegen;
	private ArrayList<Depot_1> depots;

	public Kunde(String name, double gesVermoegen, ArrayList<Depot_1> depots) {
		Name = name;
		Vermoegen = gesVermoegen;
		this.depots = depots;
	}

	public Kunde() {

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getVermoegen() {
		return Vermoegen;
	}

	public void setVermoegen(double vermoegen) {
		Vermoegen = vermoegen;
	}

	public ArrayList<Depot_1> getDepots() {
		return depots;
	}

	public void setDepots(ArrayList<Depot_1> depots) {
		this.depots = depots;
	}

	@Override
	public String toString() {
		return "Kunde [Name=" + Name + ", Vermoegen=" + Vermoegen + ", depots=" + depots + "]";
	}

}
