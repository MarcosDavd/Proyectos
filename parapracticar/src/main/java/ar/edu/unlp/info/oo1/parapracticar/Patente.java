package ar.edu.unlp.info.oo1.parapracticar;

public abstract class Patente {
	private String patente;
	public Patente (String unapatente) {
		this.patente=unapatente;
	}
	
	 public abstract String informarPatente();
}