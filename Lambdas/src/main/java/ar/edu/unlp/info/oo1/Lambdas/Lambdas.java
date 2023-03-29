package ar.edu.unlp.info.oo1.Lambdas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambdas {
	//En esta claseintento comprender
	//el uso de expresiones lambdas y streams
	private List<Alumno>alumnos;
	private Set<Alumno>alumnos2;
	
	public Lambdas() {
		this.alumnos=new ArrayList<>();
		this.alumnos2=new HashSet<>();
	} 
	
	//COMENZANDO CON EL FILTER
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Set<Alumno> getAlumnos2() {
		return alumnos2;
	}

	public void setAlumnos2(Set<Alumno> alumnos2) {
		this.alumnos2 = alumnos2;
	}

	public void agregarAlumno(Alumno a) {
		this.alumnos.add(a);
	}
	public void agregarAlumno2(Alumno a) {
		this.alumnos.add(a);
	}
	public Set<Alumno> lista2(){
		return this.alumnos2;
	}
	public List<Alumno>lista1(){
		return this.alumnos;
	}
	
	
	
}
