package sportista;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sportista s1 = new Sportista("Mirko", "Mirkovic", 1999);
		Sportista s2 = new Sportista("Petar", "Petrovic", 2000);
		Sportista s3 = new Sportista("Milan", "Milanovic", 2001);
		System.out.println(s1.ispis());
		System.out.println(s2.ispis());
		System.out.println(s3.ispis());

		Klub k1 = new Klub("Partizan", "Beograd", 1946);
		k1.dodajSportistu(s1);
		k1.dodajSportistu(s2);
		k1.dodajSportistu(s3);
		System.out.println(k1);
	}

}
