package ar.edu.unlp.info.oo1.Ejercicio8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Distribuidora {
	private double precioKWh;
	private Set<Usuario>usuarios=new HashSet<>();
	private List<Factura>factura=new ArrayList<>();
	
	public void agregarUsuario(Usuario unUsuario) {
		this.usuarios.add(unUsuario);
		
	}
	public List<Factura> getFactura(){
		
	} 
	public double consumoTotalActiva() {}
	public void precioKWh(double unKWh) {
		this.precioKWh=unKWh;
	}
}
