package itbootcamp.zadaci;

import java.util.Scanner;

public class ZbirBrojeva {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner tastatura = new Scanner(System.in);
		int i = 0;
		int broj = 0;
		int sum = 0;

		while (broj >= 0) {
			sum = sum + broj;
			System.out.println("Unesite " + (i + 1) + ". broj ");
			broj = tastatura.nextInt();
			i++;

		}
		System.out.println("Suma unetih pozitivnih brojeva je " + sum);

	}

}
