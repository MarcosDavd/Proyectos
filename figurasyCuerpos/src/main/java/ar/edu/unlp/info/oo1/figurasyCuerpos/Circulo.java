package ar.edu.unlp.info.oo1.figurasyCuerpos;

public class Circulo extends Figura {
	private double radio;
	public double getDiametro() {
		return this.radio*2;
	}
	public Circulo() {
	}
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public void setPerimetro() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getPerimetro() {	
		return Math.PI * this.getDiametro();
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * (this.radio*this.radio);
	}
	@Override
	public void setArea() {
		// TODO Auto-generated method stub
		
	}
}
