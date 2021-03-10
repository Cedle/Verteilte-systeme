package rest.server;

import java.util.ArrayList;

public class Client {
	private int kundennummer;
	private String kundenVorname;
	private String kundenNachname;
	private double GesVermoegen;
	private ArrayList<Depot_> depots;

	public Client() {

	}

	public Client(int kundennummer, String kundenVorname, String kundenNachname) {
		this.kundennummer = kundennummer;
		this.kundenVorname = kundenVorname;
		this.kundenNachname = kundenNachname;
	}

	public int getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	public String getKundenVorname() {
		return kundenVorname;
	}

	public void setKundenVorname(String kundenVorname) {
		this.kundenVorname = kundenVorname;
	}

	public String getKundenNachname() {
		return kundenNachname;
	}

	public void setKundenNachname(String kundenNachname) {
		this.kundenNachname = kundenNachname;
	}

	public ArrayList<Depot_> getDepots() {
		return depots;
	}

	public void setDepots(ArrayList<Depot_> depots) {
		this.depots = depots;
	}

	public double getGesVermoegen() {
		return GesVermoegen;
	}

	public void setGesVermoegen(double gesVermoegen) {
		GesVermoegen = gesVermoegen;
	}

	@Override
	public String toString() {
		return "Client [kundennummer=" + kundennummer + ", kundenVorname=" + kundenVorname + ", kundenNachname="
				+ kundenNachname + ", GesVermoegen=" + GesVermoegen + ", depots=" + depots + "]";
	}

}
