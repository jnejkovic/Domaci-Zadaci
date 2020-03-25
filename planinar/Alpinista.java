package planinar;

public class Alpinista extends Planinar {

	private Alpinista partner;

	public Alpinista(String ime, String prezime) {
		super(ime, prezime);
		int visina = 3000;

	}

	public Alpinista getPartner() {
		return partner;
	}

	public void setPartner(Alpinista buduciPartner) {
		// partner = buduciPartner;

		if (this.partner == null && buduciPartner.partner == null) {
			this.partner = buduciPartner;
			buduciPartner.partner = this;
		}
	}

//	public void setPartner(Alpinista a) {
//		if (partner == null) {
//			Alpinista trenutni=partner;
//			partner = a;
//			a=trenutni;
//			;
//		}
//	}

	public String toString() {
		return "A_" + super.getIme() + "_" + super.getPrezime() + "-" + super.getId();

	}

}
