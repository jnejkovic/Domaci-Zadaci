package itbootcamp.zadaci;

import java.util.Scanner;

public class NosivostLifta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da
		 * li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese.
		 * Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut
		 */
		Scanner s = new Scanner(System.in);

		double nosivost = 680;
		System.out.println("Unesite ukupnu masu koja ce se prevoziti liftom u kilogramima");
		double masa = s.nextDouble();

		if (masa < 0)
			System.out.println("Masa ne moze biti manja od nule");
		else if (nosivost < masa)
			System.out.println("Lift je preopterecen");
		else if (nosivost == masa)
			System.out.println("Lift je na granici opterecenosti");
		else
			System.out.println("Lift je pokrenut");

	}

}
