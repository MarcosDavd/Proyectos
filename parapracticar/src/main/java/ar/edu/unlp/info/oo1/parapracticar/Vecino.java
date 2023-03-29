package ar.edu.unlp.info.oo1.parapracticar;

import java.util.ArrayList;
import java.util.List;

public class Vecino {
	private String nombre;
	private int numcasa;
	private List<Vecino> vecinos;
	public String getNombre() {
		return nombre;
	}
	public Vecino ( String nom , int dir) {
		this.nombre=nom;
		this.numcasa=dir;
		this.vecinos=new ArrayList<>();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumcasa() {
		return numcasa;
	}
	public void setNumcasa(int numcasa) {
		this.numcasa = numcasa;
	}
	
	
	public void setVecino(Vecino unvecino) { // Este metodo icia la accion de hacer vecinos
		this.agregarVecino(unvecino); // tambien puedo usar add pero el metodo estaria mal por solo un uso
		unvecino.agregarVecino(this);
	}// si llegara a usar el metodo set se crearia una bucle infinito 
	public void agregarVecino(Vecino unvecino) { // Este metodo agrega un vecino a mi lista de vecinos
		this.vecinos.add(unvecino);
	}
	public List<Vecino> getVecinos(){
		return this.vecinos;
	}
	
}
