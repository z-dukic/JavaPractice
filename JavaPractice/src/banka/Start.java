package banka;

import java.util.ArrayList;
import java.util.List;

public class Start {

	private List<Banka> banka;

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
		ucitajAkciju();
	}

	private void ucitajAkciju() {
		switch (Ulaz.ucitajInt("Odaberite akciju: ", "Niste unijeli cijelibroj", 1, 4)) {
		case 1:
			stanjeRacuna();
		case 2:
			isplataNovca();
		case 3:
			uplataNovaca();
		case 4:
			System.out.println("Hvala Vam što koristite usluge Erste banke");
		}

	}

	private void uplataNovaca() {

	}

	private void isplataNovca() {

	}

	private void stanjeRacuna() {
		stanjeKuna(1250.37);
	}

	private static double stanjeKuna(double kune) {
		return kune = 0;

	}

	public static void main(String[] args) {
		new Start();

	}

}
