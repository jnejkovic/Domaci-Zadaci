package itbootcamp.zadaci;

import java.util.Scanner;

public class BrReciKojePocinjuSaD {

	public static void main(String[] args) {
		/*
		 * Korisnik unosi recenicu po izboru. Prebrojati koliko ima reci koje pocinju
		 * slovom d
		 */
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica = tastatura.nextLine();
		String[] reci = recenica.split(" ");
		int br = 0;
		for (int i = 0; i < reci.length; i++) {
			reci[i] = reci[i].toLowerCase();
			if (reci[i].charAt(0) == 'd') {
				br++;
			}
		}
		System.out.println("U recenici ima " + br + " reci koje pocinju slovom d.");
	}

}
