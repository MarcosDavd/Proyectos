package ar.edu.unlp.info.oo1.PrimerRec;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Compra extends Orden{

	public Compra(String p, LocalDate f,List<Repuesto> r) {
		super(p, f,r);
	}
	
	@Override
	public double calcularCostosDeOrden() {
		double total=super.getRepuestos().stream().mapToDouble(r -> r.getCosto()).sum();
		boolean mayor= super.getRepuestos().stream().anyMatch(r -> ChronoUnit.YEARS.between(r.getFechaDeFabricacion(), LocalDate.now())>5 );
		if(mayor) {
			return  total* 1.08;
		}else
			return total * 1.15;
	}	
	
}
