package ar.edu.unlp.info.oo1.DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Consumo>consumos;
	private List<Factura>facturas;
	public Usuario(String nom , String dom) {
		this.nombre=nom;
		this.domicilio=dom;
		this.consumos=new ArrayList<>();
		this.facturas=new ArrayList<>();
	}
	
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	public double ultimoConsumoActiva() {
		return this.consumos.get(this.consumos.size()).getConsumoDeEnergiaActiva();
	}
	public Factura FacturaEnBaseA(double preciokwh) {
		return ;
	}
	public List<Factura> facturas(){
		
		return this.facturas();
	}
	
	public Consumo ultimoConsumo() {
		return this.consumos.get(this.consumos.size());
	}
}
