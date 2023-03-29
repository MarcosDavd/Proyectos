package ar.edu.unlp.info.oo1.PrimerRec;

import java.time.LocalDate;

public class Factura {
	private LocalDate fecha;
	private String patente;
	private double montofinal;
	private double decuento;
	
	public Factura(LocalDate f,String p,double m,double d) {
		this.decuento=d;
		this.fecha=f;
		this.montofinal=m;
		this.patente=p;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public double getMontofinal() {
		return montofinal;
	}

	public void setMontofinal(double montofinal) {
		this.montofinal = montofinal;
	}

	public double getDecuento() {
		return decuento;
	}

	public void setDecuento(double decuento) {
		this.decuento = decuento;
	}
	
	
}
