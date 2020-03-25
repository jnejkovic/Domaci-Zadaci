package pozoriste;

public class Glumac extends Zaposleni {

	private String uloga;

	public Glumac(String imePrezime, Pozoriste pozoriste, String uloga) {
		super(imePrezime, pozoriste);
		this.uloga = uloga;
	}

	public String toString() {
		return uloga + "_" + super.toString();
	}

}
