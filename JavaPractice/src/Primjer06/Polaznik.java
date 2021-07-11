package Primjer06;

public class Polaznik extends Osoba {

	private String brojUgovara;

	public String getBrojUgovara() {
		return brojUgovara;
	}

	public void setBrojUgovara(String brojUgovara) {
		this.brojUgovara = brojUgovara;
	}

	public Polaznik(int sifra, String ime, String prezime, String brojUgovara) {
		super(sifra, ime, prezime);
		this.brojUgovara = brojUgovara;
	}

	public Polaznik() {

	}

}
