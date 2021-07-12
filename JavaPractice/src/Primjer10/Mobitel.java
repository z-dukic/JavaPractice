package Primjer10;

public class Mobitel {

	private String naziv;
	private String boja;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public Mobitel() {
		// TODO Auto-generated constructor stub
	}

	public Mobitel(String naziv, String boja) {

		this.naziv = naziv;
		this.boja = boja;
	}

}
