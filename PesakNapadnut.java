package itbootcamp.zadaci;

import java.util.Scanner;

public class PesakNapadnut {

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

	public static boolean proveraUnosa(int[] pozicija) {
		boolean odgovor = true;
		if (pozicija[0] == pozicija[2] && pozicija[1] == pozicija[3]) {
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

	public static String pesakNapadnut(int[] niz) {
		String odgovor = "Pesak nije napadnut";
		if ((Math.abs(niz[0] - niz[2]) == 2 && Math.abs(niz[1] - niz[3]) == 1)
				|| (Math.abs(niz[0] - niz[2]) == 1 && Math.abs(niz[1] - niz[3]) == 2))
			odgovor = "Pesak je napadnut";

		return odgovor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] pozicije = pozicijeFigura(sc);
		while (proveraUnosa(pozicije) == false) {
			pozicije = pozicijeFigura(sc);

		}
		ispisiPozicije(pozicije);
		System.out.println(" --> " + pesakNapadnut(pozicije));

	}

}
