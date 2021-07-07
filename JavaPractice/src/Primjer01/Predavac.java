package Primjer01;

public class Predavac extends Osoba {

	private String ziroracun;

	public String getZiroracun() {
		return ziroracun;
	}

	public void setZiroracun(String ziroracun) {
		this.ziroracun = ziroracun;
	}
	
	public Predavac() {
		
	}

	public Predavac(int sifra, String ime, String prezime, String ziroracun) {
		super(sifra, ime, prezime);
		this.ziroracun = ziroracun;
	}
	
	
	
	
}
