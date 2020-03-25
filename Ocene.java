package dodatniZadaci.itbootcamp;

import java.util.Scanner;

public class Ocene {

	public static void main(String[] args) {
		/*
		 * 2. Test se ocenjuje uzimajuci obzir broj osvojenih poena na sledeci nacin:
		 * poeni <50 => ocena je 5 50<= poeni <60 => ocena je 6 60<= poeni <70 => ocena
		 * je 7 70<= poeni <80 => ocena je 8 80<= poeni <90 => ocena je 9 poeni >= 90 =>
		 * ocena je 10. Napisati program koji sa standardnog ulaza ucitava broj poena i
		 * korisniku ispisuje koju je ocenu dobio.
		 */
		Scanner tastatura = new Scanner(System.in);
		
		System.out.println("Unesite broj poena");
		
		int poeni = tastatura.nextInt();
		if (poeni>=0 && poeni<=100) {
		
		if (poeni>=90)System.out.println("Dobili ste 10");
		else if(poeni >= 80)System.out.println("Dobili ste 9");
		else if (poeni>=70)System.out.println("Dobili ste 8");
		else if (poeni>=60)System.out.println("Dobili ste 7");
		else if(poeni>=50)System.out.println("Dobili se 6");
		else System.out.println("Dobili ste 5");
		

	}
		else System.out.println("greska u unosu");
}
}
