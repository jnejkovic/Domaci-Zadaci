package voznja;

import java.util.ArrayList;

public class Autobus {

	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, double cenaKarte) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		putnici = new ArrayList<Putnik>();

	}

	public boolean dodajVozaca(Vozac v) {
		if (vozac == null) {
			vozac = v;
			return true;
		}
		return false;

	}

	public boolean ukloniVozaca(Vozac v) {
		if (vozac == v) {
			vozac = null;
			return true;
		}
		return false;
	}

	public void dodajPutnika(Putnik p) {
		if(p!=null) {
		putnici.add(p);}
		else System.out.println("Morate dodati putnika");

	}

	public boolean ukloniPutnika(Putnik p) {
		for (int i = 0; i < putnici.size(); i++) {
			if (putnici.get(i) == p) {
				putnici.remove(i);
				return true;
			}
		}
		return false;
	}

	public void naplataKarte() {
		if (vozac != null) {
			for (int i = 0; i < putnici.size(); i++) {
				if (putnici.get(i) != null) {
					if (putnici.get(i).oduzmiNovac(cenaKarte) == false)
						ukloniPutnika(putnici.get(i));

				}
			}
		}
	}

	public String toString() {
		String ispis = naziv.toUpperCase() + " (" + vozac + " - ";
		for (int i = 0; i < putnici.size() - 1; i++) {
			ispis += putnici.get(i) + ", ";
		}
		ispis += putnici.get(putnici.size() - 1) + ")";
		return ispis;
	}
}
