package dodatniZadaci.itbootcamp;

import java.util.Scanner;

public class PoznavanjeWhilePetlje {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce da testira poznavanje while petlje na sledeci nacin:
		 * Ispisuje poruku sa pitanjem koja kljucna rec izlazi iz petlje u programskom
		 * jeziku Java, i ponudjene odgovore: A: int B: continue C: exit D: break
		 * Obezbediti da nakon odabira korisnik dobije informaciju da li je tacno
		 * odgovorio na pitanje.
		 * 
		 * Ukoliko nije, pitati ga da li zeli da pokusa ponovo i ako je odgovor potvrdan
		 * omoguciti ponovni pokusaj.
		 */
		Scanner tastatura = new Scanner(System.in);

		boolean odgovor = false;

		while (!odgovor) {
			System.out.println("Koja kljucna rec izlazi iz petlje u programskom jeziku Java?");
			System.out.println("A: int");
			System.out.println("B: continue");
			System.out.println("C: exit");
			System.out.println("D: break");
			System.out.println("Vas odgovor je:");
			String a = tastatura.next();

			switch (a) {
			case "A":
			case "B":
			case "C":
				System.out.println("Odgovor je pogresan. Da li zelite da pokusate ponovo?");
				System.out.println("da ili ne");
				String b = tastatura.next();
				if (b.trim().equalsIgnoreCase("da")) {
					System.out.println("Pokusajte ponovo");
				} else
					odgovor = true;
				break;

			case "D":
				System.out.println("Odgovor je tacan!");
				odgovor = true;
				break;
			default:
				System.out.println("Unesite jednu od ponudjenih opcija: A, B, C ili D");
				break;
			}
		
		}

	}

}
