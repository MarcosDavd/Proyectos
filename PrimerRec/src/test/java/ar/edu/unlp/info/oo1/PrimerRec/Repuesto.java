package ar.edu.unlp.info.oo1.PrimerRec;

import java.time.LocalDate;

public class Repuesto {
	private String nombre;
	private LocalDate fechaDeFabricacion;
	private double costo;
	
	public Repuesto(double costo, LocalDate unafecha ,String nombre) {
		this.costo=costo;
		this.fechaDeFabricacion=unafecha;
		this.nombre=nombre;
	}
	public Repuesto() {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeFabricacion() {
		return fechaDeFabricacion;
	}
	public void setFechaDeFabricacion(LocalDate fechaDeFabricacion) {
		this.fechaDeFabricacion = fechaDeFabricacion;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
}
