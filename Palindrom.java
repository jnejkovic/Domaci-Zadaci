package itbootcamp.zadaci;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		 * palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		 * palindrom). Korisnik unosi int [ ]
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
			System.out.println("Unesite " + (i + 1) + " element niza");
			niz[i] = tastatura.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(niz[i] + " ");
		}
		String odgovor = "Niz je palindrom";
		for (int i = 0; i < n / 2; i++) {
			if (niz[i] != niz[n - i - 1]) {
				odgovor = "Niz nije palindrom";
				break;
			}
		}
		System.out.println(odgovor);

	}

}
