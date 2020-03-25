package itbootcamp.zadaci;

import java.util.Scanner;

public class RastuciNiz {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5054 Ispis: Niz je rastuci.
		 */

		Scanner tastatura = new Scanner(System.in);
		int n = 0;
		while (n <= 0) {
			System.out.println("Unesite pozitivan broj n koji predstavlja duzinu niza");
			n = tastatura.nextInt();
		}
		int[] niz = new int[n];
		String odgovor = "Niz je rastuci";
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			niz[i] = tastatura.nextInt();

		}
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				if (niz[i] <= niz[i - 1]) {
					odgovor = "Niz nije rastuci";
					break;
				}
			}

		}
		System.out.println(odgovor);
	}
}
