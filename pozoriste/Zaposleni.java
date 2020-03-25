package pozoriste;

public class Zaposleni {

	private String imePrezime;
	private Pozoriste pozoriste;

	public Zaposleni(String imePrezime, Pozoriste pozoriste) {
		this.imePrezime = imePrezime;
		this.pozoriste = pozoriste;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String toString() {
		return imePrezime + "[" + pozoriste.getNaziv() + "]";
	}

}
