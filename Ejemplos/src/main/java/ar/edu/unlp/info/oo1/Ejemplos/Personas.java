package ar.edu.unlp.info.oo1.Ejemplos;

public class Personas {
	private String nombre;
	private String apellido;
	private int edad;
	private double peso;
	
	
	public Personas(String nombre, String apellido, int edad, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.peso = peso;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
