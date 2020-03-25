package itbootcamp.zadaci;

import java.util.Scanner;

public class SumaParnihProizvodNeparnih {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju). // podrazumeva se da se n ucitava preko
		 * standardnog ulaza
		 */

		Scanner tastatura = new Scanner(System.in);

		int n = 0;
		while (n <= 0) {
			System.out.println("Unesite pozitivan broj n");
			n = tastatura.nextInt();
		}
		int i = 0;
		int sum = 0;
		int proizvod = 1;

		while (i <= n) {
			if (i % 2 == 0)
				sum = sum + i;
			else
				proizvod = proizvod * i;

			i = i + 1;
		}

		System.out.println("Zbir parnih brojeva od 0 do " + n + " je " + sum);
		System.out.println("Proizvod neparnih brojeva od 0 do " + n + " je " + proizvod);

	}
}
