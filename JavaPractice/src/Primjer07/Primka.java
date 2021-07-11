package Primjer07;



public class Primka extends Dokument {
	//Klasa Primka nasljeðuje Dokument i dodaje svojstvo: otpremnica

	private String otpremnica;
	
	
	
	
	public Primka(int id, double iznos, String datum, String otpremnica) {
		super(id, iznos, datum);
		this.otpremnica = otpremnica;
	}




	public String getOtpremnica() {
		return otpremnica;
	}




	public void setOtpremnica(String otpremnica) {
		this.otpremnica = otpremnica;
	}




	public Primka() {
		
	}

}
