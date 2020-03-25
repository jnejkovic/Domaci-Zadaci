package planinar;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KlasicanPlaninar k1=new KlasicanPlaninar("Zika", "Zikic");
		KlasicanPlaninar k2=new KlasicanPlaninar("Mika", "Mikic");
		System.out.println(k1);
		
		Alpinista a1=new Alpinista("Pera", "Peric");
		Alpinista a2=new Alpinista("Zoran", "Zoric");
		System.out.println(a2);
		
		Planina p1=new Planina("Avala",1000);
		Planina p2=new Planina("Himalaji",3500);
		
		a1.setPartner(a2);
		//a2.setPartner(a1);
		p2.dodajPlaninara(k1);
		p2.dodajPlaninara(k2);
		p2.dodajPlaninara(a1);
		p2.dodajPlaninara(a2);
		System.out.println(p1.ispisPlaninara());
		System.out.println(p2.ispisPlaninara());
		p2.proveraUspesnosti();
		
	}

}
