package itbootcamp.zadaci;

import java.util.Scanner;

public class PravougaonikOdZvezdica {

	public static void main(String[] args) {
		/*
		 * Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Primer: ulaz m=3, n=7; Izlaz (vidljivo u konzoli) Hint: koristiti dve for
		 * petlje;
		 */
		Scanner tastatura = new Scanner(System.in);

		int m = 0;
		int n = 0;
		while (m <= 0) {
			System.out.println("Unesite pozitivan broj m");
			m = tastatura.nextInt();
		}

		while (n <= 0) {
			System.out.println("Unesite poztivan broj n");
			n = tastatura.nextInt();
		}

		int i, j;

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
