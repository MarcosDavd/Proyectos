package ar.edu.unlp.info.oo1.Ejercicio12;

public class Esfera extends Pieza {
	private double radio;
	public Esfera(String material, String color,double radio) {
		super(material, color);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public double getVolumenDeMaerial() {
		return 4/3 * Math.PI*Math.pow(this.radio, 3);
	}
	@Override
	public double getSuperficieDeColor() {
		
		return 4 * Math.PI*Math.pow(this.radio, 2);
	}
	
	
}
