package ar.edu.unlp.info.oo1.Ejercicio13;

import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo>archivos;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public List<Archivo> getArchivos() {
		return archivos;
	}
	public void setArchivos(Archivo archivo) {
		this.archivos.add(archivo);
	}
	
}
