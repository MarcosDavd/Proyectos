package ar.edu.unlp.info.oo1.Ejercicio3_Presupuesto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto extends Object{
	private LocalDate fecha;
	private String cliente;
	ArrayList<Item> items = new ArrayList<>();
	
	public Presupuesto(){
	}
	
	public Presupuesto(String uncliente) {
		this.fecha=LocalDate.now();
		this.cliente=uncliente;
		
	}
	public Presupuesto cliente(String cliente) {
		this.cliente=cliente;
		return this;
	}
	
	public void agregarItem(Item item) {
	   items.add(item);
	}
	public double calcularTotal() {
		return 0;
	}


}
