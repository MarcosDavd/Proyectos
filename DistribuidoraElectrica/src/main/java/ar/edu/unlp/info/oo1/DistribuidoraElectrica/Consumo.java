package ar.edu.unlp.info.oo1.DistribuidoraElectrica;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double consumoDeEnergiaActiva;
	private double consumoDeEnergiaReactiva;
	
	public Consumo(LocalDate unafecha, double ea , double er) {
		this.fecha=unafecha;
		this.consumoDeEnergiaActiva=ea;
		this.consumoDeEnergiaReactiva=er;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getConsumoDeEnergiaActiva() {
		return consumoDeEnergiaActiva;
	}
	public void setConsumoDeEnergiaActiva(double consumoDeEnergiaActiva) {
		this.consumoDeEnergiaActiva = consumoDeEnergiaActiva;
	}
	public double getConsumoDeEnergiaReactiva() {
		return consumoDeEnergiaReactiva;
	}
	public void setConsumoDeEnergiaReactiva(double consumoDeEnergiaReactiva) {
		this.consumoDeEnergiaReactiva = consumoDeEnergiaReactiva;
	}
	public double CostoEnBaseA(double precioKWh) {
		return this.consumoDeEnergiaActiva*precioKWh;
	}
	public double factorDePotencia() {
		double ea= Math.pow(this.consumoDeEnergiaActiva,2);
		double er= Math.pow(this.consumoDeEnergiaReactiva,2);
		double res=Math.pow((ea + er),2);
		return this.consumoDeEnergiaActiva / res;
	}
	
	
}
