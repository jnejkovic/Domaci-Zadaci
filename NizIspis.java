import java.util.Arrays;
import java.util.Scanner;

public class NizIspis {

	public static void main(String[] args) {
		/*
		 * Napraviti niz celih brojeva veličine 20. Učitavati sa standardnog ulaza
		 * elemente niza, a zatim ispisati 6 najmanjih brojeva u jednom redu, a u
		 * narednom redu 5 najvećih.
		 */

		Scanner sc = new Scanner(System.in);
		int[] niz = new int[20];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + " element niza:");
			niz[i] = sc.nextInt();
		}

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		for (int i = 0; i < niz.length - 1; i++) {
			int pozicija = i;
			int min = niz[i];
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[j] < min) {
					min = niz[j];
					pozicija = j;
				}
			}
			int temp = niz[i];
			niz[i] = niz[pozicija];
			niz[pozicija] = temp;
		}
		System.out.println();
		System.out.println(Arrays.toString(niz));

		for (int i = 0; i < 5; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
		for (int i = 15; i < 20; i++) {
			System.out.print(niz[i] + " ");
		}

	}

}
