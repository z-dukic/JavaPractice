package banka;

import javax.swing.JOptionPane;

public class Ulaz {
	public static int ucitajPin(String poruka, String greska, int brojPina) {
		int broj = 0;
		while (true) {
			System.out.println(poruka);
			try {

				broj = Integer.parseInt(JOptionPane.showInputDialog(poruka));
				if (!(broj == brojPina)) {
					System.out.println("Pogrešan PIN. Molimo Vas unesite pravi PIN." );
					continue;
				}
				break;
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println(greska);
			}
		}

		return broj;
	}
}
