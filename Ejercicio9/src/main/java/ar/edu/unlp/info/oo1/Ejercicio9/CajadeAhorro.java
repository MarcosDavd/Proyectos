package ar.edu.unlp.info.oo1.Ejercicio9;

public class CajadeAhorro extends Cuenta{
	
	public CajadeAhorro() {
	}
	@Override
	public boolean puedeExtraer(double monto) {
		double adicional=(monto * 1.2);
		return adicional <= super.getSaldo(); // si lo que quiero extraer es menor a mi saldo 
	}
	
	
		
}
