package Primjer05;

public class Majica {
	
	Majica(){
		System.out.println("Unutar konstruktora");
	}
	
	private String boja;
	private char velicina;
	
	public static void obuciMajicu() {
		System.out.println("Majica je obucena");
	}
	
	public static void skinutaMajica() {
		System.out.println("Majica je skinuta");
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public char getVelicina() {
		return velicina;
	}

	public void setVelicina(char velicina) {
		this.velicina = velicina;
	}
	

}
