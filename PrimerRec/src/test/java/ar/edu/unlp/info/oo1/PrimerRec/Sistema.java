package ar.edu.unlp.info.oo1.PrimerRec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Empleado>empleados;
	private List<Repuesto>repuestos;
	private List<Orden>ordenes;
	
	public Sistema() {
		this.empleados=new ArrayList<>();
		this.ordenes=new ArrayList<>();
		this.repuestos=new ArrayList<>();
	}
	
	public Empleado darDeAltaunEmpleado(Empleado e) {
		this.empleados.add(e);
		return e;
	}
	public Repuesto darDeAltaUnRepuesto(Repuesto r ) {
		this.repuestos.add(r);
		return r;
	}
	
	public Reparacion registrarOrdenDeReparacion(String p, String d, List<Repuesto> re, List<Empleado> e) {
		Reparacion r=new Reparacion(p,LocalDate.now(),d,3,re,e);
		this.ordenes.add(r);
		return r;
	}
	public Compra registrarOrdenDeCompra(String p, List<Repuesto>r) {
		Compra c=new Compra(p,LocalDate.now(),r);
		this.ordenes.add(c);
		return c;
	}
	public List<Factura> facturarOrdenes(){
		this.ordenes.stream()
		return   
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Repuesto> getRepuestos() {
		return repuestos;
	}

	public void setRepuestos(List<Repuesto> repuestos) {
		this.repuestos = repuestos;
	}

	public List<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}
	
	
}
