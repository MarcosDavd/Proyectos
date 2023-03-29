package ar.edu.unlp.info.oo1.DistribuidoraElectrica;

import java.util.HashSet;
import java.util.Set;

public class Distribuidora {
	private double precioKWh;
	private Set<Usuario>usuarios;
	public Distribuidora() {
		this.usuarios=new HashSet<>();
	}
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	public List<Factura> facturar(){
		return this.
	}
	public double consumoTotalActiva() {
		return;
	}
	public void setPrecioKWh(double precio) {
		this.precioKWh=precio;
	}
}
