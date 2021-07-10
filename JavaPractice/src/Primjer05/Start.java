package Primjer05;

public class Start {


	public static void main(String[] args) {
		Majica majica = new Majica();
		majica.obuciMajicu();
		majica.skinutaMajica();
		majica.setBoja("Plava");
		majica.setVelicina('x');
		System.out.println(majica.toString());

	}

}
