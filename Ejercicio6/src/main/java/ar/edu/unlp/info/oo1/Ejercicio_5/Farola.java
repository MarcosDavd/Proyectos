package ar.edu.unlp.info.oo1.Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	private List<Farola>vecinas;
	private boolean encendida;
	
	public Farola() {
		vecinas=new ArrayList<>();
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, 
	* es decir el receptor del mensaje será vecino de otraFarola, 
	* al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
	/*
	* Retorna sus farolas vecinas
	*/
		this.vecinas.add(otraFarola);
		otraFarola.agregarvecina(this);
		
	}
	public void agregarvecina(Farola vecina) {
		this.vecinas.add(vecina);
	}
	public List<Farola> getNeighbors (){
		return this.vecinas;
	}

	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(!this.encendida) {
			this.encendida=true;
			for(Farola farola:this.vecinas) {
				farola.turnOn();
			}		
		}
		
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.encendida) {
			this.encendida=false;
			for(Farola farola:this.vecinas) {
				farola.turnOff();
			}		
		}
	}
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.encendida;
	}


}
