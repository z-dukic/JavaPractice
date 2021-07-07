package Primjer02;

public class Sisavci extends Zivotinja {
	
	private String kretanje;
	private String vrstaHrane;
	public String getKretanje() {
		return kretanje;
	}
	public void setKretanje(String kretanje) {
		this.kretanje = kretanje;
	}
	public String getVrstaHrane() {
		return vrstaHrane;
	}
	public void setVrstaHrane(String vrstaHrane) {
		this.vrstaHrane = vrstaHrane;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + this.kretanje + " " + this.vrstaHrane;
	}
	
	public Sisavci() {
		
	}
	public Sisavci(String boja, String velicina, String kretanje, String vrstaHrane) {
		super(boja, velicina);
		this.kretanje = kretanje;
		this.vrstaHrane = vrstaHrane;
	}
	
	

}
