package pozoriste;

import java.util.ArrayList;

public class Predstava {

	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;

	public Predstava(String naziv, Pozoriste pozoriste) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		zaposleni = new ArrayList<Zaposleni>();
	}

	public void dodajZaposlenog(Zaposleni z) {
		zaposleni.add(z);
	}

	public void izbaciZaposlenog(Zaposleni z) {
		for (int i = 0; i < zaposleni.size(); i++)
			if (z.getImePrezime().equals(zaposleni.get(i).getImePrezime())) {
				zaposleni.remove(i);
			}
	}

	public int brojZaposlenih() {
		return zaposleni.size();
	}

	public String toString() {
		String ispis = naziv + ", " + pozoriste.getNaziv() + "\n";

		for (int i = 0; i < zaposleni.size(); i++) {
			ispis += zaposleni.get(i).getImePrezime() + "\n";
		}
		return ispis;
	}
}
