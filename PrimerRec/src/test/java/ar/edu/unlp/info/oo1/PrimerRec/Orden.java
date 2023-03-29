package ar.edu.unlp.info.oo1.PrimerRec;

import java.time.LocalDate;
import java.util.List;

public abstract class Orden {
	private LocalDate fecha;
	private String patente;
	private List<Repuesto>repuestos;
	public Orden(String p,LocalDate f,List<Repuesto> r) {
		this.fecha=f;
		this.patente=p;
		this.repuestos=r;
	}
	
	public abstract double calcularCostosDeOrden(); 
	
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
	public List<Repuesto> getRepuestos() {
		return repuestos;
	}
	public void setRepuestos(List<Repuesto> repuestos) {
		this.repuestos = repuestos;
	}
}
