package Primjer02;

public class Start {
	
	// Kreirajte tri razine nasljeðivanja
	// u domeni biljnog i životinjskog svijeta
	// flora i fauna, pojam "porodica"
	// ali tako da svaka klasa ima dva svojstva

	
	public Start() {
		Pas pas = new Pas();
		pas.setBoja("Siva");
		pas.setIme("Rex");
		pas.setKretanje("Hodanje");
		pas.setPasmina("Njemaèki ovèar");
		pas.setVelicina("Sredna velicina");
		pas.setVrstaHrane("Svejed");
		
		System.out.println(pas);
		
		System.out.println();
		
	//	public Pas(String boja, String velicina, String kretanje, String vrstaHrane, String pasmina, String ime)
		Pas floki = new Pas("Bijeli","Mali","Hodanje","Svejed", "Shitzu", "Florijan");
		System.out.println(floki);
	}
	
	public static void main(String[] args) {
		new Start();

	}

}
