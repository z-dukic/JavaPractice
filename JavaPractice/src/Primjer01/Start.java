package Primjer01;

public class Start {
	
	public Start() {
		Osoba osoba = new Osoba();
		osoba.setIme("Pero");
		osoba.setPrezime("Matkov");
		osoba.setSifra(1);
		System.out.println(osoba);
		//
	}
	
	public static void main(String[] args) {
		new Start();
	}

}
