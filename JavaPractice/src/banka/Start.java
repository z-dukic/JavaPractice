package banka;

import java.util.ArrayList;
import java.util.List;

public class Start {

	private List<Banka> banka;
	static double stanje = 1560.00;

	public Start() {
		banka = new ArrayList<Banka>();
		glavniIzbornik();

	}

	private void glavniIzbornik() {
		System.out.println("****Erste Bank****");
		provjeraPina();
	}

	private void provjeraPina() {
		switch (Ulaz.ucitajPin("Molimo unesite pin", "Pogrešan PIN. Probajte ponovo", 1234)) {
		case 1234:
			drugiIzbornik();
			break;
		case 2:
			System.out.println("Hvala Vam. Doviđenja!");
			return;

		}
	}

	private void drugiIzbornik() {
		System.out.println(" 1. Stanje Vašeg računa");
		System.out.println(" 2. Isplate s računa");
		System.out.println(" 3. Uplate na račun");
		System.out.println(" 4. Kraj rada");
		System.out.println();
		ucitajAkciju();
		System.out.println();
	}

	private void ucitajAkciju() {
		switch (Ulaz.ucitajInt("Odaberite akciju: ", "Niste unijeli cijeli broj", 1, 4)) {
		case 1 -> stanjeRacuna();
		case 2 -> povlacenjeNovca();
		case 3 -> uplataNovaca();
		case 4 -> System.out.println("Hvala Vam što koristite usluge Erste banke");

		}
		System.out.println();

	}

	private void povlacenjeNovca() {
		Ulaz.isplataNovca(stanje);
		
		drugiIzbornik();
	}

	private void krajRada() {
		System.out.println("Hvala Vam što koristite usluge Erste banke");
	}

	private void uplataNovaca() {
		
		Ulaz.uplataNovca(stanje);
		
		drugiIzbornik();

	}

	private void stanjeRacuna() {
		System.out.println("Vaše stanje je: " + stanje);
		System.out.println();
		drugiIzbornik();
		System.out.println();

	}

	public static void main(String[] args) {
		new Start();

	}

}
