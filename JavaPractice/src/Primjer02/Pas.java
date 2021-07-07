package Primjer02;

public class Pas extends Sisavci {
	
	private String pasmina;
	private String ime;
	public String getPasmina() {
		return pasmina;
	}
	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	//Zivotinja je superklasa, sisavac je podklasa
	//Sisavac je superklasa, pas je podklasa
	//tj. to je linija nasljedivanja
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + this.ime + " " + this.pasmina;
	}
	
	public Pas() {
		
	}
	public Pas(String boja, String velicina, String kretanje, String vrstaHrane, String pasmina, String ime) {
		super(boja, velicina, kretanje, vrstaHrane);
		this.pasmina = pasmina;
		this.ime = ime;
	}

	
}


//Polaznik extends Osoba
//Pas extends Zivotinja