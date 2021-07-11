package Primjer07;

public class Racun extends Dokument {

	private String kupac;

	public String getKupac() {
		return kupac;
	}

	public void setKupac(String kupac) {
		this.kupac = kupac;
	}

	public Racun(int id, double iznos, String datum, String kupac) {
		super(id, iznos, datum);
		this.kupac = kupac;
	}

	public Racun() {

	}

}
