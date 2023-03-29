package ar.edu.unlp.info.oo1.PrimerRec;

public class Empleado {
	private String nombre;
	private double valorporHora;
	
	public Empleado(String nombre , double v) {
		this.nombre=nombre;
		this.valorporHora=v;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorporHora() {
		return valorporHora;
	}

	public void setValorporHora(double valorporHora) {
		this.valorporHora = valorporHora;
	}
	
}
