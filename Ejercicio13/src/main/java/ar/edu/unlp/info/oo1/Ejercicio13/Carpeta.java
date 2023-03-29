package ar.edu.unlp.info.oo1.Ejercicio13;

import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email>emails;
	
	
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(Email email) {
		this.emails.add(email);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void eliminar(Email email) {
		this.emails.remove(email);
	}
	
}
