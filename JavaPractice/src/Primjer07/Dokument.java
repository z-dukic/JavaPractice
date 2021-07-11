package Primjer07;

public class Dokument {

	// ID, iznos, datum
	private int id;
	private double iznos;
	private String datum;
	
	public Dokument() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public Dokument(int id, double iznos, String datum) {
		
		this.id = id;
		this.iznos = iznos;
		this.datum = datum;
	}

}
