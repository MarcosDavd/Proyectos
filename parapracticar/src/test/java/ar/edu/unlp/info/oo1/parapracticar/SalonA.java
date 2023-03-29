package ar.edu.unlp.info.oo1.parapracticar;

import java.util.HashSet;
import java.util.Set;

public class SalonA {
	private Set<Alumno>alumnos=new HashSet<>();
	

	public void setAlumnos(Alumno a) {	
		this.alumnos.add(a);
	}
	public Set<Alumno> getAlumnos(){
		return this.alumnos;
	}
}
