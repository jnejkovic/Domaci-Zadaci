package itbootcamp.zadaci;

import java.util.Scanner;

public class BrojMeseciKojiPocinjuIstimSlovom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima
		 * meseci u godini koji pocinju na to slovo(na taj glas) - za resavanje ovog
		 * zadatka koristiti switch
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite naziv meseca");
		String mesec = s.next();
		mesec=mesec.toLowerCase();
		switch (mesec) {
		case "januar":
		case "jun":
		case "jul":
			System.out.println("3");
			break;
		case "februar":
		case "septembar":
		case "oktobar":
		case "novembar":
		case "decembar":
			System.out.println("1");
			break;
		case "mart":
		case "maj":
		case "april":
		case "avgust":
			System.out.println("2");
			break;
		default:
			System.out.println("Neprvilan unos");
			break;

		}

	}

}
