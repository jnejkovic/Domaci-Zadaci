package itbootcamp.zadaci;

import java.util.Scanner;

public class ProizvodElemNiza {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		 * niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		 */

		Scanner tastatura = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza");
		int n = tastatura.nextInt();
		while (n <= 0) {
			System.out.println("Unesite pozitivan broj");
			n = tastatura.nextInt();
		}
		int[] niz = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + " element niza:");
			niz[i] = tastatura.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Niz[" + i + "]-->" + niz[i]);
		}
		int proizvod = 1;
		int br = 0;
		for (int i = 0; i < n; i++) {
			if (niz[i] > i) {
				proizvod *= niz[i];
				br++;
			}

		}
		if (br > 0)
			System.out.println("Proizvod elemenata niza koji su veci od svog indeksa je: " + proizvod);
		else
			System.out.println("Ne postoji element niza veci od svog indeksa");
	}

}
