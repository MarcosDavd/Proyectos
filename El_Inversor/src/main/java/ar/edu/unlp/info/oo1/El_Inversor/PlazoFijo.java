package ar.edu.unlp.info.oo1.El_Inversor;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class PlazoFijo implements Inversion{
	
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(double monto,double porcentaje, LocalDate unafecha) {
		this.fechaDeConstitucion=unafecha;
		this.montoDepositado=monto;
		this.porcentajeDeInteresDiario=porcentaje;
	}
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}
	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}
	public double getMontoDepositado() {
		return montoDepositado;
	}
	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}
	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}
	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	@Override
	public double valorActual(){
		double res=(this.getMontoDepositado()*this.getPorcentajeDeInteresDiario())/100;
		long dias=	ChronoUnit.DAYS.between(this.getFechaDeConstitucion(),LocalDate.now());
		return this.getMontoDepositado()+ (res * dias);
	}

}
