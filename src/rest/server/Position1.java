package rest.server;

public class Position1 {
	private double endbetrag;

	public Position1() {

	}

	public double getEndbetrag() {
		return endbetrag;
	}

	public void setEndbetrag(double endbetrag) {
		this.endbetrag = endbetrag;
	}

	@Override
	public String toString() {
		return "Position1 [endbetrag=" + endbetrag + "]";
	}
}
