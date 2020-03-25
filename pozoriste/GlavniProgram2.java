package pozoriste;

public class GlavniProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pozoriste p1 = new Pozoriste("Bosko Buha");
		Pozoriste p2 = new Pozoriste("Narodno pozoriste");
		Pozoriste p3 = new Pozoriste("Dusko Radovic");
		System.out.println(p3);

		Glumac g1 = new Glumac("Marko Markovic", p1, "otac");
		System.out.println(g1);

		Reditelj r1 = new Reditelj("Pera Peric", p2, "Perica");
		System.out.println(r1);

		Predstava prva = new Predstava("Neka predstava", p1);
		prva.dodajZaposlenog(g1);
		prva.dodajZaposlenog(r1);
		System.out.println(prva.brojZaposlenih());
		System.out.println(prva);
		System.out.println(p3);
	}

}
