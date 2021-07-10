package Primjer04;

import java.util.Arrays;

public class Zadatak5 {

	public static void main(String[] args) {

		String pojam = "2,3,4,3,2,3,3";

		String[] niz = pojam.split(",");
		System.out.println(Arrays.toString(niz));

		int suma = 0;
		for (String e : niz) {
			suma += Integer.parseInt(e);
		}
		System.out.println(suma);

		String drugoIme = "Petar";
		String[] niz2 = drugoIme.split("");
		System.out.println(Arrays.toString(niz2));

	}

}
