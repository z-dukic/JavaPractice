package Primjer09;

import java.util.ArrayList;
import java.util.List;

public class Start {

	
	public Start() {
		//Lista je parametrizirana s genetičkim parametrom tipa String
		//što znači da će lista moći sadržavati samo instace klase String
		List<String> lista = new ArrayList<String>();
		lista.add("Edunova"); // može
		//lista.add(22); // ne može
		
	}
	public static void main(String[] args) {
		
		new Start();

	}

}
