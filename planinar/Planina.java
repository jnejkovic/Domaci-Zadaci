package planinar;

import java.util.ArrayList;

public class Planina {

	private String ime;
	private double visina;
	private ArrayList<Planinar> planinari;

	public Planina(String ime, double visina) {
		this.ime = ime;
		this.visina = visina;
		planinari = new ArrayList<Planinar>();
	}

	public Planinar getPlaninar(Planinar p) {

		for (int i = 0; i < planinari.size(); i++) {
			if (planinari.get(i) == p) {
				return planinari.get(i);
			}
		}
		return null;
	}

	public boolean dodajPlaninara(Planinar p) {
		planinari.add(p);
		return true;
	}

	public void proveraUspesnosti() {
		boolean uspesan = true;
		for (int i = 0; i < planinari.size(); i++) {
			uspesan = true;
			Planinar trenutni = planinari.get(i);
			if (trenutni instanceof Alpinista) {
				if (((Alpinista) trenutni).getPartner() == null) {
					uspesan &= false;
				}
			}
			if (trenutni instanceof Alpinista && trenutni.getMaxVisina() <= visina) {
				System.out.println(trenutni + " penjanje je: " + (uspesan ? "uspesno" : "neuspesno"));
			} else {
				uspesan &= trenutni.getMaxVisina() >= visina;
				System.out.println(trenutni + " penjanje je: " + (uspesan ? "uspesno" : "neuspesno"));
			}
		}
	}

	public String toString() {
		return ime + "(" + visina + ")";
	}

	public String ispisPlaninara() {
		if (planinari.size() > 0) {
			String ispis = "[";
			for (int i = 0; i < planinari.size() - 1; i++) {
				ispis += planinari.get(i).toString() + ", ";

			}
			ispis += planinari.get(planinari.size() - 1).toString() + "]";
			return ispis;
		}
		String ispis = "Na planini nema planinara";
		return ispis;
	}

}
