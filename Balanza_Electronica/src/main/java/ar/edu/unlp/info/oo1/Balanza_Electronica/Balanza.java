package ar.edu.unlp.info.oo1.Balanza_Electronica;

public class Balanza {
	private int cantproductos;
	private double preciototal;
	private double pesototal;
	
	public void ponerEnCero() {
		this.cantproductos=0;
		this.pesototal=0;
		this.preciototal=0;		
	}
	public void agregarProducto(Producto p) {
		this.cantproductos++;
		this.pesototal += p.getPeso();
		this.preciototal += p.getPrecioxKilo();
	}
	public Ticket emitirTicket() {
		
		return new Ticket(this.pesototal,this.preciototal);
	}
	
}
