package ar.edu.unlp.info.oo1.Lambdas;

public class Alumno {
	private String nombre;
	private int edad ,materias;
	private double promedio;
	private String carrera;
	
	
	public Alumno(String nombre, int edad, int materias, double promedio, String carrera) {
		this.nombre = nombre;
		this.edad = edad;
		this.materias = materias;
		this.promedio = promedio;
		this.carrera = carrera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getMaterias() {
		return materias;
	}
	public void setMaterias(int materias) {
		this.materias = materias;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	

}
