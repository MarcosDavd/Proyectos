package ar.edu.unlp.info.oo1.Ejercicio13;

import java.util.List;
import java.util.Set;

public class ClienteDeCorreo {
	
	private Carpeta inbox;
	private Set<Carpeta>carpetas;
	public void recibirEmail(Email email) {
		this.inbox.setEmails(email);
	}
	public void mover(Email email , Carpeta origen,Carpeta destino) {
		destino.setEmails(email);
		origen.eliminar(email);
	}
	public Email buscar(String texto) {
		return Email;
	}
	public integer espacioOcupado() {
		return int;
	}
}
