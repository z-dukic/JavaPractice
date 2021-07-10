package Primjer04;

import java.util.Arrays;

public class Zadatak6 {

	public static void main(String[] args) {

		String str = "pepro";
		char c = str.charAt(0);
		

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				count++;
		}

		System.out.println(count);
	}

}
