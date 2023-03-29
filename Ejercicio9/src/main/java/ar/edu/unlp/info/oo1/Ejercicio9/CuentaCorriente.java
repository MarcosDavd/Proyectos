package ar.edu.unlp.info.oo1.Ejercicio9;

public class CuentaCorriente extends Cuenta {
	private double descubierto;
	public CuentaCorriente() {
		super();
		this.descubierto=0;
	}
	
	
	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	public boolean puedeExtraer(double unmonto) {
		if((unmonto + this.descubierto) <= super.getSaldo()) {
			this.descubierto = this.descubierto - unmonto; 
			return true;
		}
		return false;
	}
	
}
