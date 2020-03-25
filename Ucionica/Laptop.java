package Ucionica;

import java.util.ArrayList;

public class Laptop {

	private ArrayList<Polaznik> korisnici;
	private String marka;

	public Laptop(String marka) {
		this.marka = marka;
		korisnici = new ArrayList<Polaznik>();
	}

	public void ukloniKorisnika(Polaznik polaznik) {
		int indexZaBrisanje = -1;
		for (int i = 0; i < korisnici.size(); i++) {
			if (korisnici.get(i).getIme().equals(polaznik.getIme())
					&& korisnici.get(i).getPrezime().equals(polaznik.getPrezime())) {
				indexZaBrisanje = i;
				break;
			}

		}
		if (indexZaBrisanje != -1)
			korisnici.remove(indexZaBrisanje);
	}

	public void dodajKorisnika(Polaznik pol) {
		korisnici.add(pol);
	}

	public String toString() {
		String ispis = marka.toUpperCase() + " {";
		for (int i = 0; i < korisnici.size() - 1; i++) {
			ispis += korisnici.get(i) + ", ";

		}
		ispis += korisnici.get(korisnici.size() - 1) + "}";
		return ispis;
	}

	public String getMarka() {
		return marka;
	}

}
