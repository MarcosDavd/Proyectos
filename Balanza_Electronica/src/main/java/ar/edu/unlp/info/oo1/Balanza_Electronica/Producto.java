package ar.edu.unlp.info.oo1.Balanza_Electronica;

public class Producto {
	private double peso,precioporkilo;
	private String descripcion;
	public Producto(String desc, double peso, double pxkilo) {
		this.descripcion=desc;
		this.peso=peso;
		this.precioporkilo=pxkilo;
	}
	

	public String getDescripcion(){
		return this.descripcion;
	}
	public double getPrecioxKilo(){
		return this.precioporkilo;
	}
	public double getPeso(){
		return this.peso;
	}
}
