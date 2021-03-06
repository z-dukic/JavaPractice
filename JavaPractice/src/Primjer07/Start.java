package Primjer07;

public class Start {

	// Klasa Dokument ima svojstva: ID, iznos, datum
	// Klasa Raèun nasljeðuje Dokument i dodaje svojstvo: Kupac
	// Kupac ima ID, naziv i adresu
	// Klasa Primka nasljeðuje Dokument i dodaje svojstvo: otpremnica

	// Kreirati po jednu instancu klasa Raèun i Primka

	public Start() {
		
		Racun racun = new Racun();
		racun.setDatum("10.10.2020");
		racun.setId(1);
		racun.setIznos(10.25);
		racun.setKupac("Atlantic grupa");
		System.out.println(racun);
		
		Racun racun1 = new Racun(2,20.25,"20.12.2021.","PBZ");
		System.out.println(racun1);
		
		Primka primka = new Primka();
		primka.setDatum("10.10.2020.");
		primka.setId(5);
		primka.setIznos(102.25);
		primka.setOtpremnica("2021/25");
		System.out.println(primka);
		
		System.out.println(racun.getIznos() + primka.getIznos());
		
		

	}

	public static void main(String[] args) {
		new Start();

	}

}
