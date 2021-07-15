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
	
	public static double uplataKuna(double uplataKuna) {
		
	
		return 0;
	}
}
