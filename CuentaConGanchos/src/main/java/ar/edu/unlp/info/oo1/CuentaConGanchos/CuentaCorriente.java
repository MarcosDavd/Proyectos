package ar.edu.unlp.info.oo1.CuentaConGanchos;

public class CuentaCorriente extends Cuenta {
	private double limite;
	
	public CuentaCorriente() {
		super();
		this.limite=0;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}


	@Override
	public boolean puedeExtraer(double monto) {
		double res = this.getSaldo()+this.limite;
		if(monto <= res) {
			return true;
		}else {
		
			return false;
		}
	}
	
}
