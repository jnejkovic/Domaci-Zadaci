package itbootcamp.zadaci;

import java.util.Scanner;

public class SkakacNapadnut {

	/*
	 * Na sahovskoj tabli je red obelezen brojevima 1 2 3 4 5 6 7 8 i kolona takodje
	 * brojevima 1 2 3 4 5 6 7 8
	 * 
	 * Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni
	 * skakac sa vrha. Korisnik prvo unosi poziciju piona kao dva cela broja, a
	 * zatim poziciju skakaca, gde prvi broj predstavlja red, a drugi kolonu.
	 * Program treba da ispise da li se figure nalaze u poziciji da je skakac
	 * napadnut. Primeri: 6 4 7 4 ---> skakac nije napadnut 6 4 5 5 ---> skakac
	 * jeste napadnut 2 2 1 1 ---> skakac jeste napadnut 9 1 6 8 ---> greska u unosu
	 * 
	 */
	public static int[] pozicijeFigura(Scanner s) {

		int[] pozicija = new int[4];
		System.out
				.println("Unesite poziciju piona, a odmah zatim i poziciju konja kao dva cela broja u rasponu od 1-8");
		for (int i = 0; i < pozicija.length; i++) {

			pozicija[i] = s.nextInt();

			while (pozicija[i] < 1 || pozicija[i] > 8) {
				System.out.println("Greska u unosu. Unesite broj iz datog intervala");
				pozicija[i] = s.nextInt();
			}

		}
		return pozicija;
	}

	public static boolean proveraUnosa(int[] niz) {
		boolean odgovor = true;
		if (niz[0] == niz[2] && niz[1] == niz[3]) {
			System.out.println("Greska u unosu. Figure ne mogu biti na istoj poziciji.");
			odgovor = false;
		}
		return odgovor;
	}

	public static void ispisiPozicije(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");

		}
	}

	public static String skakacNapadnut(int[] niz) {
		String odgovor = "Skakac nije napadnut";
		if ((niz[2] == niz[0] - 1 && Math.abs(niz[3] - niz[1]) == 1))
			odgovor = "Skakac je napadnut";

		return odgovor;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] pozicije = pozicijeFigura(sc);
		while(proveraUnosa(pozicije)==false) {
			pozicije=pozicijeFigura(sc);
		}
		ispisiPozicije(pozicije);
		System.out.println(" --> " + skakacNapadnut(pozicije));

	}

}
