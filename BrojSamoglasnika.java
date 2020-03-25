import java.util.Scanner;

public class BrojSamoglasnika {

	public static int izbrojSamoglasnike(Scanner s) {
		System.out.println("Unesite rec");
		String rec = s.next().toLowerCase();
		int brojac = 0;
		for (int i = 0; i < rec.length(); i++) {
			char c = rec.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				brojac++;
			}
		}
		return brojac;
	}

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja ce da izbroji samoglasnike u prosledjenoj reci.Testirati
		 * prethodno napisanu metodu.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println(izbrojSamoglasnike(sc));
	}

}
