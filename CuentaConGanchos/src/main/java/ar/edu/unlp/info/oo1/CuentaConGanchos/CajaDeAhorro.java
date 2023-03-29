package ar.edu.unlp.info.oo1.CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	public CajaDeAhorro() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean puedeExtraer(double monto) {
		double adicional=monto * 1.2;
		if(this.getSaldo() >= adicional) {
			return true;
		}
		return false;
	}
	public void extraerSinControlar(double monto) {
		if(this.puedeExtraer(monto*1.2)) {
			super.extraerSinControlar(monto*1.2);
		}
	}
	public void depositar(double monto) {
		double adicional=(monto*2)/100;
		super.depositar(monto-adicional);
	}
	public boolean transferirACuenta(double monto, Cuenta destino) {
		double adicional=(2*monto)/100;
		return super.transferirACuenta(monto+adicional, destino);
	}

}
