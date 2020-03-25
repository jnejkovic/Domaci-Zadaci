package itbootcamp.zadaci;

import java.util.Scanner;

public class MeniZaKasu {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 1 - dodavanje cene proizvoda na racun (ubacivanje u
		 * potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 */
		Scanner tastatura = new Scanner(System.in);
		System.out.println("MENI");
		System.out.println("0 Izlaz");
		System.out.println("1 Dodavanje cene proizvoda");
		System.out.println("2 Naplata racuna");
		int opcija;
		float racun = 0;
		float cena = 0;
		do {
			opcija = tastatura.nextInt();
			switch (opcija) {
			case 1:
				System.out.println("Unesite cenu proizvoda");
				cena = tastatura.nextFloat();
				if (cena > 0) {
					racun = racun + cena;
					System.out.println("Vas racun je " + racun);
				} else
					System.out.println("Unesite ispravnu cenu");
				break;
			case 2:
				if (racun > 0) {
					System.out.println("Unesite kolicinu novca za naplatu");
					float naplata = tastatura.nextFloat();

					if (naplata > 0) {

						if (racun <= naplata) {
							System.out.println("Uspesno ste platili racun");
							System.out.println("Vas kusur je " + (naplata - racun));
							racun = 0;
							System.out.println("Vas racun je sada " + racun);
						} else
							System.out.println("Nemate dovoljno novca za placanje");
					} else
						System.out.println("Unesite pozitivnu vrednost");
				} else
					System.out.println("Prvo unesite cenu proizvoda");
				break;
			case 0:
				System.out.println("Hvala na koriscenju aplikacije");
				break;
			default:
				System.out.println("Izaberite jednu od ponudjenih opcija");
			}
			if (opcija != 0) {
				System.out.println("MENI");
				System.out.println("0 Izlaz");
				System.out.println("1 Dodavanje cene proizvoda");
				System.out.println("2 Naplata racuna");
			}
		} while (opcija != 0);
	}
}
