package itbootcamp.zadaci;

public class BrojeviDeljiviSa3 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		 * (ukljucujuci i njih) deljivih brojem 3.
		 */
		int n;
		int brojac = 0;
		for (n = 9; n >= 9 && n <= 250; n++) {
			if (n % 3 == 0) {
				brojac += 1;
			}

		}
		System.out.println("Ukupno brojeva deljivih sa 3 u opsegu od 9 do 250 je "+ brojac);
	}

}
