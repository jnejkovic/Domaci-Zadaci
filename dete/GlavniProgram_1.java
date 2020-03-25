package dete;

public class GlavniProgram_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dete marko=new Dete("Marko","Markovic",10,5);
		Dete dusan=new Dete("Dusko", "Dugousko", 9, 10);
		Dete milica=new Dete("Milica","Markovic",8,20);
		Dete.ukupnoKlikera();
		marko.dodajKlikere(20);
		Dete.ukupnoKlikera();
		milica.oduzmiKlikere(5);
		Dete.ukupnoKlikera();
		Dete.prosekGodina();
		dusan.oduzmiKlikere(12);
		Dete.ukupnoKlikera();
	}
	

}
