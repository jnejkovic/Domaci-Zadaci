package Ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polaznik p1=new Polaznik("Marko","Markovic");
		Polaznik p2=new Polaznik("Zika","Zivkovic");
		Polaznik p3=new Polaznik("Mara","Maric");
		Polaznik p4=new Polaznik("Jelica","Jelic");
		System.out.println(p1);
		Laptop komp1=new Laptop("Asus");
		Laptop komp2=new Laptop("Dell");
		komp1.dodajKorisnika(p1);
		komp1.dodajKorisnika(p2);
		komp1.dodajKorisnika(p3);
		System.out.println(komp1);
		komp2.dodajKorisnika(p4);
		System.out.println(komp2);
		komp1.ukloniKorisnika(p1);
		komp1.ukloniKorisnika(new Polaznik("Zika","Zivkovic"));
		System.out.println(komp1);
	}

}
