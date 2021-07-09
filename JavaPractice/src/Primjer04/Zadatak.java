package Primjer04;

import java.util.Scanner;

public class Zadatak {

	public static void main(String[] args) {

		String prvoIme = "Marko";
		String drugoIme = "Kristina";

		char[] ch1 = new char[prvoIme.length()];
		char[] ch2 = new char[drugoIme.length()];

		for (int i = 0; i < prvoIme.length(); i++) {
			ch1[i] = prvoIme.charAt(i);
		}

		for (int i = 0; i < drugoIme.length(); i++) {
			ch2[i] = drugoIme.charAt(i);

		}

		for (char c : ch1) {
			System.out.print(c);

		}
		for (char c : ch2) {
			System.out.print(c);

		}


	}
}
