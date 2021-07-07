package Primjer01;

public class Osoba {

	private int sifra;
	private String ime;
	private String prezime;
	
	//Generiranje punih konstruktora
	//Prima sva svojstva koja klasa posjeduje
	//tzv. puni konstruktor - prima sva svojstva klase
	public Osoba(int sifra, String ime, String prezime) {
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public Osoba() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override //anotacija - uputa 3rd party librarya što èiniti
	public String toString() {
		
		return this.ime + " " + this.prezime;
	}
	
	public String predstaviSe() {
		return "g. " + this.prezime;
	}



	
	

}
