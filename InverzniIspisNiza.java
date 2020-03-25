package itbootcamp.zadaci;

import java.util.Scanner;

public class InverzniIspisNiza {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
		 */

		Scanner tastatura = new Scanner(System.in);
		int n = 0;
		while (n <= 0) {
			System.out.println("Unesite pozitivan broj n (broj elemenata niza)");
			n = tastatura.nextInt();
		}
		int[] niz = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			niz[i] = tastatura.nextInt();
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}
	}

}
