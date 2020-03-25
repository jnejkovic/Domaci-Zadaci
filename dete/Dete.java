package dete;

public class Dete {
	/*
	 * Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se
	 * kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda
	 * oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce ispisivati
	 * broj klikera i metodu koja ispisuje prosecan broj decjih godina(ako imamo
	 * troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo
	 * prosecne godine za to dvoje) .
	 */

	private String ime;
	private String prezime;
	private int godine;
	private static int ukupnoGodina;
	private static int brDece;
	private int brKlikera;
	private static int ukupnoKlikera;

	public Dete(String ime, String prezime, int godine, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.brKlikera = brKlikera;
		brDece++;
		ukupnoKlikera += brKlikera;
		ukupnoGodina += godine;
	}

	public void dodajKlikere(int broj) {
		brKlikera += broj;
		ukupnoKlikera += broj;
	}

	public boolean oduzmiKlikere(int broj) {
		if (broj <= brKlikera) {
			brKlikera -= broj;
			ukupnoKlikera -= broj;
			return true;
		} else {
			System.out.println("Greska. Dete nema dovoljno klikera.");
			return false;
		}
	}

	public static void ukupnoKlikera() {
		System.out.println(ukupnoKlikera);
	}

	public static void prosekGodina() {
		System.out.println("Prosek godina dece je: " + ukupnoGodina / brDece);
	}

}
