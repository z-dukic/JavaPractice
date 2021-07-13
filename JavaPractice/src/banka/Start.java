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
		System.out.println("Molimo Vas unesite PIN");
		System.out.println("Odustani");
		provjeraPina();
	}

	private void provjeraPina() {
		switch (Ulaz.ucitajPin("Molimo unesite pin", "Pogrešan PIN. Probajte ponovo", 1234)) {
		case 1:
			stanjeRacuna();
			break;
		case 2:
			System.out.println("Hvala Vam. Doviđenja!");
			
		}
	}

	public static void main(String[] args) {
		new Start();

	}

}
