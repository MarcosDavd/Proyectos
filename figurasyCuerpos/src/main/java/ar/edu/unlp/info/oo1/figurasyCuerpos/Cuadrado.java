package ar.edu.unlp.info.oo1.figurasyCuerpos;

public class Cuadrado extends Figura {
	private double lado;
	public Cuadrado() {
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void setPerimetro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 2);
	}

	@Override
	public void setArea() {
		// TODO Auto-generated method stub
		
	}
	
}
