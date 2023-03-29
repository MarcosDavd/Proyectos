package ar.edu.unlp.info.oo1.Presupuestos;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item (String detalle,int cantidad,double costounitario ) {
		this.cantidad=cantidad;
		this.costoUnitario=costounitario;
		this.detalle=detalle;
	}
	public Item() {
		this.cantidad=0;
		this.costoUnitario=0;
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

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}

	public double costo() {
		return this.costoUnitario * this.cantidad;
	}
}
