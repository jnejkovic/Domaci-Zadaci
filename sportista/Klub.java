package sportista;

public class Klub {

	private String nazivKluba;
	private String sediste;
	private int godOsnivanja;
	private Sportista[] igraci;
	private int poz;

	public Klub(String naziv, String grad, int god) {
		nazivKluba = naziv;
		sediste = grad;
		godOsnivanja = god;
		igraci = new Sportista[30];

	}

	public String getNazivKluba() {
		return nazivKluba;
	}

	public void setNazivKluba(String kl) {
		nazivKluba = kl;
	}

	public String getSediste() {
		return sediste;
	}

	public int getGodina() {
		return godOsnivanja;
	}

//	public Sportista[] getIgraci(Sportista[] i) {
//		return igraci;
//	}

	public void dodajSportistu(Sportista s) {
		igraci[poz] = s;
		poz++;
	}

	public String toString() {
		String ispis = nazivKluba + ", " + sediste + " (" + godOsnivanja + ")" + ", Igraci: ";
		for (int i = 0; i < poz - 1; i++) {
			ispis += igraci[i] + ", ";
		}
		ispis += igraci[poz - 1] + ".";
		return ispis;
	}
}
