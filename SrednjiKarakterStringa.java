import java.util.Scanner;

public class SrednjiKarakterStringa {

	public static char[] srednjiKarakter(String rec, Scanner s) {
		int duzina = rec.length();
		if (duzina % 2 == 0) {
			char[] c = new char[2];
			c[0] = rec.charAt(duzina / 2 - 1);
			c[1] = rec.charAt(duzina / 2);
			return c;

		} else {
			char[] c = new char[1];
			c[0] = rec.charAt(duzina / 2);
			return c;
		}

	}

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja ce naci srednji karakter stringa koji mu se prosledjuje
		 * kao argument. Ukoliko niz znakova ima paran broj elemenata onda ce vratiti
		 * dva srednja karaktera.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite rec:");
		String rec = sc.next();
		System.out.println(srednjiKarakter(rec, sc));
	}

}
