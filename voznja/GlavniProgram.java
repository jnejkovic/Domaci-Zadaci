package voznja;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Putnik p1=new Putnik("Pera", "Peric", 1200);
		Putnik p2=new Putnik("Mika","Mikic",850);
		Putnik p3=new Putnik("Mara","Maric",100);
		Vozac v1=new Vozac("Laza", "Lazic");
		Vozac v2=new Vozac("Marko","Markovic");
		System.out.println(p1.dodajNovac(100));
		System.out.println(p2.oduzmiNovac(900));
		System.out.println(p1);
		Autobus a=new Autobus("Mercedes",250);
		a.dodajPutnika(p2);
		a.dodajPutnika(p3);
		a.dodajVozaca(v1);
		System.out.println(a);
		a.naplataKarte();
		System.out.println(p3);
		System.out.println(a);
		a.dodajPutnika(null);
	}

}
