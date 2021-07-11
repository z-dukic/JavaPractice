package Primjer06;

public class Start {
	
	public Start() {
		Osoba osoba = new Osoba();
		osoba.setIme("Petar");
		osoba.setPrezime("Perić");
		osoba.setSifra(1);
		
		Polaznik polaznik = new Polaznik();
		polaznik.setIme("Marija");
		polaznik.setPrezime("Marić");
		polaznik.setBrojUgovara("253/21");
		polaznik.setSifra(2);
		
		Predavac predavac = new Predavac();
		predavac.setIme("Marko");
		predavac.setPrezime("Marulić");
		predavac.setSifra(3);
		predavac.setZiroRacun("HR232412562563");
		
		Polaznik pero = new Polaznik(1,"Perica","Perković","2021/532");
	}

	public static void main(String[] args) {
		new Start();

	}

}
