package ar.edu.unlp.info.oo1.parapracticar;

import java.util.ArrayList;
import java.util.List;

public class PracticandoStreams {
	private List<Persona>personas;
	public PracticandoStreams() {
		this.personas=new ArrayList<>();
	}
	
	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}
	//COMO PRACTICA DE USO DE STREAMS TRATAR DE USASR TODOS
	public List<Persona> getPersonas() {
		return this.personas;
	}
	
	//Devuelve a persona mas mayor de la lista
	public Persona mayorDeEdad() {
		Persona pr = new Persona();
		int max=-1;
		for(Persona p:personas) {
			
			if(p.getEdad()> max) {
				max=p.getEdad();
				pr=p;
			}
		}
		return pr;
	}
	//obtener el promedio de edades
	
	public double promedioDeEdades() {
		double total =this.personas.stream().mapToDouble(p -> p.getEdad()).sum();
		return total/this.personas.size();
	}
	//obterner 
	public Persona mayorDeCienAnios() {
		return this.personas.stream().filter(p -> p.getEdad()>100).findFirst().orElse(null);
	}
	
}
