package itbootcamp.zadaci;

import java.util.Scanner;

public class PovrsinaOkreceneProstorije {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se
		 * ivice prostorije ucitavaju preko konzole. (Pretpostavka je da soba ima zidove
		 * oblika pravougaonika i nema prozore).
		 */

		Scanner s = new Scanner(System.in);

		double p;

		System.out.println("Unesite duzinu sobe");
		double a = s.nextDouble();

		if (a <= 0)
			System.out.println("Duzina sobe mora biti veca od nule");

		else {
			System.out.println("Unesite sirinu sobe");

			double b = s.nextDouble();

			if (b <= 0)
				System.out.println("Sirina sobe mora biti veca od nule");
			else {
				System.out.println("Unesite visinu sobe");
				double h = s.nextDouble();

				if (h <= 0)
					System.out.println("Visina mora biti veca od nule");
				else

				if (a != h && b != h && a != b) {
					p = 2 * a * h + 2 * b * h + a * b;
					System.out.println("Povrsina okrecene prostorije je:");
					System.out.println(p);
				} else
					System.out.println("Sirina,duzina i visina moraju biti razlicite");

			}

		}
	}
}
