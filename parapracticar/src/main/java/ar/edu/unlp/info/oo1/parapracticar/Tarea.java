package ar.edu.unlp.info.oo1.parapracticar;

public class Tarea {
	private String Materia;
	private int act;;
	
	public Tarea() {
		// TODO Auto-generated constructor stub
	}
	
	public Tarea setAct(int actividad) {
		this.act = actividad;
		return this;
	}
	public Tarea devolverTarea() {
		return this;
	}
	
	public Tarea setMateria(String materia) {
		Materia = materia;
		return this;
	}
	/*public void setAct(int actividad) {
		this.act=actividad;
	}*/
	
	public int getAct() {
		return this.act;
	}
	public void calcularsuma() {
		System.out.print("hola");
	}
	public String getMateria() {
		return this.Materia;
	}
}
