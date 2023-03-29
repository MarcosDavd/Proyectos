package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantProductos;
	private double pesototal;
	private double preciototal;
	
	public Ticket (int cantp,double pesot,double preciot) {
		this.fecha=LocalDate.now();
		this.cantProductos=cantp;
		this.pesototal=pesot;
		this.preciototal=preciot;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantProductos;
	}

	public void setCantProductos(int cantProductos) {
		this.cantProductos = cantProductos;
	}

	public double getPesoTotal() {
		return pesototal;
	}

	public void setPesototal(double pesototal) {
		this.pesototal = pesototal;
	}

	public double getPrecioTotal() {
		return preciototal;
	}

	public void setPreciototal(double preciototal) {
		this.preciototal = preciototal;
	}

	public double impuesto() {
		return (this.preciototal*21)/100;
	}

}
