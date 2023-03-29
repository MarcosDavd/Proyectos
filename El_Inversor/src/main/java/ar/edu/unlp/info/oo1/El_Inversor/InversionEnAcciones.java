package ar.edu.unlp.info.oo1.El_Inversor;

public class InversionEnAcciones implements Inversion {
		
	private String nombre;
	private int cantidad;
	private double valorunitario;
	public InversionEnAcciones(String nom,int cantidad,double valorU) {
		this.cantidad=cantidad;
		this.nombre=nom;
		this.valorunitario=valorU;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(double valorunitario) {
		this.valorunitario = valorunitario;
	}

	@Override
	public double valorActual() {
		return this.getCantidad()*this.getValorunitario();
	}
	
}
