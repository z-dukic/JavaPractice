package Primjer01;

public class Start {
	// jedna klasa može nasljediti samo jednu nadklasu
	// jedna klasa ne može nasljediti dvije razlièite klase
	public Start() {
		Osoba osoba = new Osoba();
		osoba.setIme("Pero");
		osoba.setPrezime("Matkov");
		osoba.setSifra(1);
		System.out.println(osoba);
		//ekvivalent
		System.out.println(osoba.toString());
		// metoda overload - ako ta metoda ne postoji onda se poziva iz superklase, ako postoji onda se "pregazi" metoda 
		System.out.println(osoba.predstaviSe());
		
		System.out.println();
		
		System.out.println(osoba.predstaviSe());
		 Polaznik polaznik = new Polaznik();
		 polaznik.setIme("Marija");
		 polaznik.setPrezime("Zimska");
		 polaznik.setSifra(1);
		 polaznik.setBrojUgovora("2021/56");
		 System.out.println(polaznik);
		 
		 System.out.println(polaznik.predstaviSe());
		 
		 
		 System.out.println();
		 
		 Predavac predavac = new Predavac(); //Poziva konstruktor iz klase object
		 predavac.setSifra(1);
		 predavac.setIme("Marin");
		 predavac.setPrezime("Kartik");
		 predavac.setZiroracun("HR32532353535353");
		 
		 
		 
		 System.out.println(predavac);
		 System.out.println(predavac.predstaviSe());
		 
		 System.out.println();
		 
		 Polaznik p1 = new Polaznik(1,"Ivan","Deklom","2021/57");
		 System.out.println(p1);
		 
		 System.out.println();
		 
		 Predavac pr = new Predavac(1,"Pero","Peric","hr2323232323");
		 System.out.println(pr);
	
	}

	public static void main(String[] args) {
		new Start();
	}

}
