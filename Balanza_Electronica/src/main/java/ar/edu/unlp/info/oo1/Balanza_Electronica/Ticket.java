package ar.edu.unlp.info.oo1.Balanza_Electronica;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private double precioTotal;
	private double pesoTotal;
	
	public Ticket(double pesototal , double preciototal) {
		this.fecha=LocalDate.now();
		this.pesoTotal=pesototal;
		this.precioTotal=preciototal;
	}
	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}


	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}


	public double impuesto() {
		return this.precioTotal + (this.precioTotal * 0.21);
	}

}
