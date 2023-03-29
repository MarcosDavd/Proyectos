
package ar.edu.unlp.info.oo1.parapracticar;

import java.util.ArrayList;
import java.util.List;

public class Salon {
	private int numero;
	private List<Alumno>alumnos;
	
	public Salon (int num) {
		this.numero=num;
		this.alumnos=new ArrayList<>();
	}
	
	public int getNumero() {
		return this.numero;
		
	}
	public void setAlumnos(Alumno a) {
		this.alumnos.add(a);
	}
	
	public List<Alumno> getAlumnos(){
		return this.alumnos;
	}
	
}
