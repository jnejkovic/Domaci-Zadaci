package dodatniZadaci.itbootcamp;

import java.util.Scanner;

public class MaxTriBroja {

	public static void main(String[] args) {
		//  Ucitati tri broja i ispisati njihov maksimum
		
		Scanner tastatura=new Scanner(System.in);
		System.out.println("Unesite prvi broj");
		double broj1=tastatura.nextDouble();
		System.out.println("Unesite drugi broj");
		double broj2=tastatura.nextDouble();
		System.out.println("Unesite treci broj");
		double broj3=tastatura.nextDouble();
		
		
		if(broj1>broj2 && broj1>broj3)System.out.println("Maksimum je "+broj1);
		else if (broj2>broj3)System.out.println("Maksimum je "+broj2);
		else System.out.println("Maksimum je broj "+broj3);

	}

}
