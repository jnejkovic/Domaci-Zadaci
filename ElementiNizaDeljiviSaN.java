package itbootcamp.zadaci;

import java.util.Scanner;

public class ElementiNizaDeljiviSaN {

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 */

		Scanner tastatura = new Scanner(System.in);
		int n = 0;
		System.out.println("Unesite broj elemenata niza n");
		while (n <= 0) {
			n = tastatura.nextInt();
			if (n <= 0)
				System.out.println("Unesite pozitivan broj");

		}
		System.out.println("Unesite neki broj sa kojim ce se deliti elementi niza");
		int br = tastatura.nextInt();
		int[] niz = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			niz[i] = tastatura.nextInt();

		}
		System.out.print("Elementi niza deljivi sa brojem " + br + " su: ");
		for (int i = 0; i < n; i++) {
			if (niz[i] % br == 0)
				System.out.print(niz[i] + " ");

		}

	}

}
