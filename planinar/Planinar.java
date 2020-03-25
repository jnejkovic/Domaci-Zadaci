package planinar;

public class Planinar {

	private String ime;
	private String prezime;
	private int id;
	private static int globalId=1;
	private int visina;
	
	public Planinar(String ime,String prezime) {
		this.ime=ime;
		this.prezime=prezime;
		id=globalId;
		globalId++;
	}
	
	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getId() {
		return id;
	}

	public static int getGlobalId() {
		return globalId;
	}

	public int getMaxVisina() {
		return visina;
	}

	public String toString() {
		return ime+"_"+prezime+"-"+id;
	}
}
