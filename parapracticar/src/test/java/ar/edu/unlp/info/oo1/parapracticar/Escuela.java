package ar.edu.unlp.info.oo1.parapracticar;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
	private String nombre;
	private Direccion direccion;
	private List<Salon>salones;
	public Escuela (String nom,Direccion dir){
		this.nombre=nom;
		this.direccion=dir;
		this.salones=new ArrayList<>();
	}
	public String getNombre() {
		return this.nombre;
	}
	public Direccion getDireccion() {
		return this.direccion;
	}
	
	public void setSalones(Salon unsalon) {
		this.salones.add(unsalon);
	}
	public List<Salon> getsalones(){
		return this.salones;
	} 
	
	
	// Para el caso de la escuela es necesario poder ingresar alumnos a un salon
	// Luego debemos agregar ese salon de alumnos a los salones que tiene la escuela
	// De esta forma podemos crear un aescuela con salones y alumnos
}
