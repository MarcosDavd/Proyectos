package ar.edu.unlp.info.oo1.parapracticar;

public class Estudiante {
	private String nombre;
	private int dni;
	
	public Estudiante() {
		
	}
	public Estudiante(String nom,int undni) {
		this.dni=undni;
		this.nombre=nom;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String toString() {
		return "Nombre : "+this.getNombre()+" DNI : "+this.getDni();
	}
}
