package pozoriste;

public class Pozoriste {

	private String naziv;
	private int id;
	private static int globalId;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
		id = globalId;
		globalId++;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getId() {
		return id;
	}

	public static int getGlobalId() {
		return globalId;
	}

	public String toString() {
		return naziv + "[" + id + "]";
	}

}
