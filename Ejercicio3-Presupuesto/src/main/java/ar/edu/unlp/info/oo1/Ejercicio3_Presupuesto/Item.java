package ar.edu.unlp.info.oo1.Ejercicio3_Presupuesto;

public class Item extends Object {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item() {
		
	}
	
	public String getDetalle() {
		return detalle;
	}


	public Item detalle(String detalle) {
		this.detalle = detalle;
		return this;
	}


	public int getCantidad() {
		return cantidad;
	}


	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}
	public void setCantidad(int cantidad) {
		this.cantidad=cantidad;
	}

	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}


	public double costo() {
		return this.costoUnitario*this.cantidad;
	}
	public double getCostoUnitario() {
		return this.costoUnitario;
	}

}
