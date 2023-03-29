package ar.edu.unlp.info.oo1.DistribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	public Factura(double ea,double descuento,Usuario u) {
		this.descuento=descuento;
		this.fecha=LocalDate.now();
		this.montoEnergiaActiva=ea;
		this.usuario=u;
	}
	public double montoTotal() {
		return ;
	}
	public Usuario getUsuario() {
		return this.usuario;
	}
	public LocalDate getFecha() {
		return this.fecha;
		
	}
	public double getDescuento() {
		return this.descuento;
	}
	public double getMontoEnergiaActiva() {
		return this.montoEnergiaActiva;
	}
}
