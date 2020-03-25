import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnosPlata {

	public static void main(String[] args) {
		/*
		 * U sistemu postoji sedam korisnika. Korisnici unose iznos svoje mesečne zarade
		 * sve dok ne unesu negativnu vrednost za iznos. Nakon toga kreće unos za
		 * sledećeg korisnika i tako dalje. Program se prekida kada neki korisnik unese
		 * vrednost 0. Pre prekida treba ispisati svim korisnicima prosečne plate.
		 * Napomena: Dakle, obezbediti da ne mora svih sedam unositi zarade!
		 */

		Scanner sc = new Scanner(System.in);
		double[] prosPlate = new double[7];
		for (int i = 0; i < 7; i++) {
			double plata = 1;
			double suma = 0;
			int brojac = 0;
			double prosek = 0;
			System.out.println("Unesite plate " + (i + 1) + ". korisnika:");
			while (plata > 0) {

				plata = sc.nextDouble();
				if (plata < 0) {
					break;
				} else {
					suma += plata;
					brojac++;
					prosek = suma / brojac;
				}
			}
			prosPlate[i] = prosek;
			if (plata == 0)
				break;

		}
		for (int i = 0; i < 7; i++) {
			System.out.print(prosPlate[i] + " ");
		}
	}

}
