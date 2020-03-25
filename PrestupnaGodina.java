package dodatniZadaci.itbootcamp;

import java.util.Scanner;

public class PrestupnaGodina {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ispituje da li je godina prestupna ili nije, sve dok
		 * korisnik za godinu ne unese broj koji nije pozitivan.
		 */
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Unesite godinu");
		int godina=tastatura.nextInt();
		while (godina>0) {
			if ((godina%4==0 && godina%100!=0)|| godina%400==0)
				System.out.println("Godina je prestupna");
			else System.out.println("Godina nije prestupna");
			
			System.out.println("Unesite godinu");
			godina=tastatura.nextInt();
		}
		System.out.println("prekid programa");
	}

}
