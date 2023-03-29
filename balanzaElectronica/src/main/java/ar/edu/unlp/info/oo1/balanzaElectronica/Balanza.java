package ar.edu.unlp.info.oo1.balanzaElectronica;

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
		this.pesototal+=p.getPeso();
		this.preciototal+=p.getPrecio();
	}
	
	public int getCantidadDeProductos() {
		return cantproductos;
	}
	public void setCantproductos(int cantproductos) {
		this.cantproductos = cantproductos;
	}
	public double getPrecioTotal() {
		return preciototal;
	}
	public void setPrecioTotal(double preciototal) {
		this.preciototal = preciototal;
	}
	public double getPesoTotal() {
		return pesototal;
	}
	public void setPesototal(double pesototal) {
		this.pesototal = pesototal;
	}
	public Ticket emitirTicket() {
	  return  new Ticket(this.cantproductos , this.pesototal, this.preciototal);
	}
}
