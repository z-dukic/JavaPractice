package Primjer04;

public class Zadatak3 {

	public static void main(String[] args) {
		System.out.println(countOccurences("elephant", 'e', 0));

	}

	private static int countOccurences(
			  String someString, char searchedChar, int index) {
			    if (index >= someString.length()) {
			        return 0;
			    }
			    
			    int count = someString.charAt(index) == searchedChar ? 1 : 0;
			    return count + countOccurences(
			      someString, searchedChar, index + 1);

}
}
