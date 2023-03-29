package ar.edu.unlp.info.oo1.parapracticar;

public class Alumno {
	private String nombre,apellido;
	
	public Alumno(String nom , String ape) {
		this.apellido=ape;
		this.nombre=nom;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
