package ar.edu.unlp.info.oo1.Ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza>piezas;
	public ReporteDeConstruccion() {
		this.piezas=new ArrayList<>();
	}
	public List<Pieza> getPiezas() {
		return this.piezas;
	}
	public void setPiezas(Pieza pieza) {
		this.piezas.add(pieza);
	}
	public double getVolumenDeMateria(String material) {
		return this.piezas.stream().filter(pieza -> pieza.getMaterial().equals(material)).mapToDouble(p -> p.getVolumenDeMaerial()).sum();
	}
	public double getSuperficieDeColor(String color) {
		return this.piezas.stream().filter(pieza -> pieza.getColor().equals(color)).mapToDouble(p -> p.getSuperficieDeColor()).sum();
	}
	
}
