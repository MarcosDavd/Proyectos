package ar.edu.unlp.info.oo1.PrimerRec;

import java.time.LocalDate;
import java.util.List;

public class Reparacion extends Orden{
	private String descripcion;
	private int horasdereparacion;
	private List<Empleado>empleados;
	
	
	public Reparacion(String p, LocalDate f,String d,int h,List<Repuesto> r,List<Empleado> e) {
		super(p, f,r);
		this.descripcion=d;
		this.horasdereparacion=h;
		this.empleados=e;
		// TODO Auto-generated constructor stub
	}
	
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getHorasdereparacion() {
		return horasdereparacion;
	}

	public void setHorasdereparacion(int horasdereparacion) {
		this.horasdereparacion = horasdereparacion;
	}

	@Override
	public double calcularCostosDeOrden() {
		double total = super.getRepuestos().stream().mapToDouble(r -> r.getCosto()).sum() + (this.empleados.get(0).getValorporHora()* this.horasdereparacion);
		return total * 1.1;
	}
	
	
}
