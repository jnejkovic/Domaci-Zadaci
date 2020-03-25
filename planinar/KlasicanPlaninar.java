package planinar;

public class KlasicanPlaninar extends Planinar {
	
	private static int maxVisina=2000;

	
	public KlasicanPlaninar(String ime,String prezime) {
		super(ime,prezime);
		//int visina=2000;
	
		
	}
	public String toString() {
		return "K_"+super.getIme()+"_"+super.getPrezime()+"-"+super.getId();
	}

}
