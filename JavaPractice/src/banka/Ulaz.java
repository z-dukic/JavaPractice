package banka;

import javax.swing.JOptionPane;

public class Ulaz {
	public static int ucitajPin(String poruka, String greska, int brojPina) {
		int broj = 0;

		for (int i = 0; i < 4; i++) {
			if (i == 3) {
				System.out.println("Tri puta pogrešno upisat PIN. Kartica blokirana.");
				break;

			}
			System.out.println(poruka);
			try {

				broj = Integer.parseInt(JOptionPane.showInputDialog(poruka));
				if (!(broj == brojPina)) {

					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println(greska);

			}

		}
		return broj;

	}

	public static int ucitajInt(String poruka, String greska, int min, int max) {
		int broj = 0;

		while (true) {
			try {
				broj = Integer.parseInt(JOptionPane.showInputDialog(poruka));

				if (broj < min || broj > max) {
					System.out.println("Broj ne smije biti manji od " + min + " ili veći od " + max);
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println(greska);
			}

		}

		return broj;
	}

	public static double ucitajDouble(String poruka, String greska, int min, int max) {
		double broj = 0;

		while (true) {
			try {
				broj = Double.parseDouble(JOptionPane.showInputDialog(poruka));

				if (broj < min || broj > max) {
					System.out.println("Broj ne smije biti manji od " + min + " ili veći od " + max);
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println(greska);
			}

		}

		return broj;
	}

	public static void stanjeKuna(double stanje) {

		System.out.println("Vaše stanje je: " + stanje);
		System.out.println();

	}

	public static double isplataNovca(double stanje) {

		double iznosIsplate = Double.parseDouble(JOptionPane.showInputDialog("Koliko novaca želite povući?"));

		if (stanje < iznosIsplate) {
			System.out.println("Nemate dovoljno sredstava za transakciju");
		} else {
			stanje = stanje - iznosIsplate;
			System.out.println("povukli ste: " + iznosIsplate);
			System.out.println("Trenutacno stanje Vaseg racuna je: " + stanje);

		}

		return stanje - iznosIsplate;
	}

	public static double uplataNovca(double stanje) {

		double iznosUplate = Double.parseDouble(JOptionPane.showInputDialog("Koliko novaca želite uplatiti?"));

		stanje = stanje + iznosUplate;
		System.out.println("Na račun ste dodali: " + iznosUplate);
		System.out.println("Trenutacno stanje Vaseg racuna je: " + stanje);

		return stanje + iznosUplate;
	}
}
