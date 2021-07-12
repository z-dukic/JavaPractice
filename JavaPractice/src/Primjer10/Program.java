package Primjer10;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Program {
	private List<Mobitel> mobiteli;

	public Program() { // konstruktor

		mobiteli = new ArrayList<Mobitel>(); // 1. Napravi arraylist mobiteli
		ucitajMobitele(); // 2. Napravi metodu za učitavanje mobitela
		ispisiMobitele(); // Metoda za ispisivanje mobitela

	}

	private void ispisiMobitele() {
		for (Mobitel m : mobiteli) { //za svaki (foreach) mobitel m u mobiteli, ispiši 
			System.out.println(m.getNaziv());
		}

	}

	private void ucitajMobitele() {
		Mobitel mobitel; // Instanca mobitela
		while (true) { // učitavanje mobitela beskonačno
			mobitel = new Mobitel(); // Za svako novo učitanje je novi mobitel
			mobitel.setNaziv(JOptionPane.showInputDialog("Unesi naziv")); // učitaj ime mobitela
			mobiteli.add(mobitel); // Svaki upisani mobitel dodaj u listu
			if (JOptionPane.showInputDialog("Unesi K za kraj").equals("k")) { // Ako uneseš k, prestani
				break;
			}
		}

	}

	public static void main(String[] args) {

		new Program(); // main koji poziva konstruktor
	}

}
