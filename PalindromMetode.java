package itbootcamp.zadaci;

import java.util.Scanner;

public class PalindromMetode {

	/*
	 * Domaci zadatak od utorka “da li je niz celih brojeva palindrom ili nije”
	 * uradi koristeci metode.
	 */

	public static int[] ucitajNiz(Scanner s) {
		System.out.println("Unestite broj elemenata niza");
		int n = s.nextInt();
		while (n <= 0) {
			System.out.println("Greska. Unesite pozitivan broj n");
			n = s.nextInt();
		}
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + " element niza");
			niz[i] = s.nextInt();
		}
		return niz;
	}

	public static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	public static void palindrom(int[] niz) {
		String odgovor = "Niz je palindrom";
		for (int i = 0; i < niz.length / 2; i++) {
			if (niz[i] != niz[niz.length - i - 1]) {
				odgovor = "Niz nije palindrom";
				break;
			}
		}
		System.out.println(odgovor);
	}

	public static void main(String[] args) {

		Scanner tastatura = new Scanner(System.in);

		int[] niz = ucitajNiz(tastatura);
		ispisiNiz(niz);
		System.out.println();
		palindrom(niz);
	}

}
