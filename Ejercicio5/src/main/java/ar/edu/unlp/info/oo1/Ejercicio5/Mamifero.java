package ar.edu.unlp.info.oo1.Ejercicio5;

import java.time.LocalDate;

public class Mamifero {	
	private String id;
	private String especie;
	private LocalDate fechadenacimiento;
	private Mamifero madre,padre;
	//CONSTRUCTORS
	public Mamifero(String id) {
		this.id=id;
	}
	public Mamifero() {		
	}
	
	//METHODS
	
	public String getIdentificador() {
		return id;
	}
	public void setIdentificador(String id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechadenacimiento() {
		return fechadenacimiento;
	}
	public void setFechadenacimiento(LocalDate fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}
	public Mamifero getMadre() {
		return this.madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getPadre() {
		return this.padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getAbueloPaterno() {
		if(this.getPadre()!=null) {
			if(this.getPadre().getPadre()!=null) {
				return this.getPadre().getPadre();
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	public Mamifero getAbuelaPaterna() {
		if(this.getPadre()!=null) {
			if(this.getPadre().getMadre()!=null) {
				return this.getPadre().getMadre();
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	public Mamifero getAbueloMaterno() {
		if(this.getMadre()!=null) {
			if(this.getMadre().getPadre()!=null) {
				return this.getMadre().getPadre();
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre()!=null) {
			if(this.getMadre().getMadre()!=null) {
				return this.getMadre().getMadre();
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean tiene=false;
		if(this.getMadre()!=null) {
			if(this.getMadre().equals(unMamifero)) {
				tiene=true;
			}
			else {
				tiene=this.getMadre().tieneComoAncestroA(unMamifero);
			}
		}
		if((this.getPadre()!=null)&&(tiene != true)){
			if(this.getPadre().equals(unMamifero)) {
				tiene=true;
			}
			else {
				tiene=this.getPadre().tieneComoAncestroA(unMamifero);
			}
		}
		return tiene;
	}
}
