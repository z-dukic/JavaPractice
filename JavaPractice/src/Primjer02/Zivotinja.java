package Primjer02;

public class Zivotinja {
	private String boja;
	private String velicina;

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getVelicina() {
		return velicina;
	}

	public void setVelicina(String velicina) {
		this.velicina = velicina;
	}
	@Override
	public String toString() {
		
		return this.boja + " " + this.velicina;
		
	}

	public Zivotinja(String boja, String velicina) {
		super();
		this.boja = boja;
		this.velicina = velicina;
	}
	
	public Zivotinja() {
		
	}

	
}
