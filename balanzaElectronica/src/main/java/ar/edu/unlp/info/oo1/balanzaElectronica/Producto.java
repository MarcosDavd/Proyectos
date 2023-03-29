package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Producto {
	private double peso;
	private double precioxkilo;
	private String descripcion;
	
	public double getPrecio() {
		return this.peso*this.precioxkilo; 
	}
	public double getPeso(){
		return this.peso;
	}
	public void setPeso(double unpeso) {
		this.peso=unpeso;
	}
	public void setPrecioPorKilo(double unprecio) {
		this.precioxkilo=unprecio;
	}
	public double getPrecioPorKilo() {
		return this.precioxkilo;
	}
	public void setDescripcion(String unadescripcion) {
		this.descripcion=unadescripcion;
	}
	public String getDescripcion(){
		return this.descripcion;
	}
	
	
}
