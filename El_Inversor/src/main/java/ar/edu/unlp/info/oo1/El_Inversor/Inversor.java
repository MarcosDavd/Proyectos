package ar.edu.unlp.info.oo1.El_Inversor;

import java.util.List;

public class Inversor implements Inversion{
	private String nombre;
	private List<Inversion>inversiones;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Inversion> getInversiones() {
		return inversiones;
	}
	public void setInversiones(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	@Override
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(inversion -> inversion.valorActual()).sum();
	}
	
}
