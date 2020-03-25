package dodatniZadaci.itbootcamp;

import java.util.Scanner;

public class KvadratPravougaonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Korisnik unosi dve dimenzije pravougaonika. Potrebno je proveriti da
		 *  li je u pitanju kvadrat i ispisati informaciju o tome.
		 */

		Scanner tastatura=new Scanner(System.in);
		
		System.out.println("Unesite prvu stranicu pravougaonika");
		double a = tastatura.nextDouble();
		if (a>0) {
		
		System.out.println("Unesite drugu stranicu pravougaonika");
		double b = tastatura.nextDouble();
		
		if (b>0) {
			if(a==b) System.out.println("U pitanju je kvadrat");
			else System.out.println("U pitanju je pravougaonik");
		
	}
		else System.out.println("Unesite pozitivnu vrednost");

}
		else System.out.println("Unesite pozitivnu vrednost");
}
}