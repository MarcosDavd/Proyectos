package ar.edu.unlp.info.oo1.Presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item>items;
	public Presupuesto () {	
		items=new ArrayList<>();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}

	public List<Item> getItems() {
		return items;
	}

	public void agregarItem(Item unitem) {
		this.items.add(unitem);
	}
	public double calcularTotal() {
		double total = 0 ;
		total = this.items.stream().mapToDouble(unitem -> unitem.costo()).sum();
		return total;
	}
}
