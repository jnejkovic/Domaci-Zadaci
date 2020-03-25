package sportista;

public class Sportista {

	private String ime;
	private String prezime;
	private int godiste;

	public Sportista() {

	}

	public Sportista(String ime, String prezime, int godiste) {
		this.ime = ime;
		this.prezime = prezime;
		this.godiste = godiste;

	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodiste() {
		return godiste;
	}

	public String ispis() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase() + ": " + godiste + ".";
	}

	public String toString() {
		return ime + " " + prezime;
	}

}
