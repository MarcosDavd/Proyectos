package ar.edu.unlp.info.oo1.parapracticar;

public class Persona {
	private String nombre;
	private int edad;
	
    public Persona(String unnombre , int unaedad) {
    	this.edad=unaedad;
    	this.nombre=unnombre;
    }
    public Persona() {
    	
    }
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
