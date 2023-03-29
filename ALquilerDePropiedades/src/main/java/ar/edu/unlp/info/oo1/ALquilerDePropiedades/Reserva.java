package ar.edu.unlp.info.oo1.ALquilerDePropiedades;

import java.time.LocalDate;

public class Reserva {
	private Propiedad propiedad;
	private LocalDate ini,fin;
	private Usuario usuario;
	
	
	public boolean estaLibre(LocalDate fecha) {
		return (fecha.isBefore(ini)&&fecha.isAfter(fin));
	}
	
}
