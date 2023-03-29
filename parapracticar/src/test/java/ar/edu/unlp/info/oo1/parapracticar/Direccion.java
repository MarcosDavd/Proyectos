package ar.edu.unlp.info.oo1.parapracticar;

public class Direccion {
	private int calle,avenida;
	
	public Direccion(int calle , int avenida) {
		this.avenida=avenida;
		this.calle=calle;
	}
	public int getCalle() {
		return calle;
	}

	public void setCalle(int calle) {
		this.calle = calle;
	}

	public int getAvenida() {
		return avenida;
	}

	public void setAvenida(int avenida) {
		this.avenida = avenida;
	}
	
	
}
