package voznja;

public class Putnik extends Covek {

	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public boolean dodajNovac(double iznos) {
		if (iznos > 0) {
			novac += iznos;
			return true;
		}
		return false;
	}

	public boolean oduzmiNovac(double iznos) {
		if (iznos > 0 && iznos <= novac) {
			novac -= iznos;
			return true;
		}
		return false;
	}

	public String toString() {
		return getIme().toUpperCase() + " " + getPrezime().toUpperCase() + " [" + novac + "]";
	}
}
