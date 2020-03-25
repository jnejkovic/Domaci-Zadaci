package dodatniZadaci.itbootcamp;

import java.util.Scanner;

public class DvaBroja {

	public static void main(String[] args) {
		// Ucitati dva broja i ispisati koji od njih je veci.

		Scanner tastatura = new Scanner(System.in);
		System.out.println("Upisite broj1");
		double broj1 = tastatura.nextDouble();

		System.out.println("Upisite broj2");
		double broj2 = tastatura.nextDouble();
		
		if(broj1>broj2)System.out.println(broj1 + " je veci od " + broj2);
		else if (broj1==broj2)System.out.println("Brojevi su jednaki");
		else System.out.println(broj2+" je veci od "+ broj1);
	}

}
