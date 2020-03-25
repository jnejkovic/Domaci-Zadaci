package itbootcamp.zadaci;

import java.util.Scanner;

public class FibonacijevNiz {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce ispisati n brojeva Fibonacijevog niza
		 */
		Scanner tastatura = new Scanner(System.in);

		int n = 0;
		while (n <= 0) {
			System.out.println("Unesite pozitivan broj n");
			n = tastatura.nextInt();

		}

		int i;
		int b1 = 0;
		int b2 = 1;
		System.out.print(b1 + " " + b2 + " ");
		int a = 0;
		for (i = 2; i < n; i++) {
			a = b1;
			b1 = b2;
			b2 = a + b2;

			System.out.print(b2 + " ");
		}
	}
}
