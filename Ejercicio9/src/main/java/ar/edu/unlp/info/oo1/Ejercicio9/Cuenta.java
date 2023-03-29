package ar.edu.unlp.info.oo1.Ejercicio9;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta () {
		this.saldo=0;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void extraerSinControlar(double monto){
		this.saldo -=monto;
	}
	
	public void depositar(double unsaldo) {
		this.saldo += unsaldo;
	}
	public abstract boolean puedeExtraer(double monto);
	
	
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	public boolean transferirAcuenta(double monto , Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.despositar(monto);
			return true;
		}
		return false;
		
	}
}
