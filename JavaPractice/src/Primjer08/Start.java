package Primjer08;

import java.util.ArrayList;
import java.util.List;

public class Start {
	
	public Start() {
		List lista = new ArrayList();
		//Lijeva strana sučelje, desna strana implementacijska klasa
		//ArrayList je metoda koja u sebi ima niz
		lista.add("Pero");
		lista.add(22);
		lista.add(true);
		//Problem je što java ne zna koja je vrsta liste (String, int itd)
	}
	

	public static void main(String[] args) {
		new Start();
	}
}
