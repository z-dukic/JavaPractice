package Primjer03;

import java.util.Scanner;

public class obradaIznimki {

	public obradaIznimki() {
		Scanner ulaz = new Scanner(System.in);
		// Scanner - tip podatka zapisan kao klasa
		// Klasa je opisnik objekta

		// Ulaz je naziv objekta
		// New je poziv konstruktora
		// Prima jedan parametar

		System.out.println("Daj broj: ");
		int i = 0;
		while(true) {
			try {
				i = Integer.parseInt(ulaz.nextLine());
				break; 

			} catch (NumberFormatException e) {
				System.out.println("Nisi mi dao cijeli broj");
			}
			
		}
		
		
		// Nisi mi dao cijeli broj
		// 0
		// Nula izbacuje nakon try/catch zato što je i=0;
		
		System.out.println(i);
		ulaz.close();
	}

	public static void main(String[] args) {

		new obradaIznimki();
	}

}
