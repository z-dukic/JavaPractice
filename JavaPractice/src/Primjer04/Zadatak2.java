package Primjer04;

public class Zadatak2 {
	public static void main(String[] args) {

		String test = "Pero";
		count(test);

	}

	public static void count(String x) {
		char[] ch = x.toCharArray();
		int letter = 0;

		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} 
		}
		System.out.println("Pero");
		System.out.println("letter: " + letter);

	}

}
