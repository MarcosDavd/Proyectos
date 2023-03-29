package ar.edu.unlp.info.oo1.Ejercicio12;

public class Cilindro extends Pieza{
	private double radio;
	private int altura;
	public Cilindro(String material, String color,double radio,int altura) {
		super(material, color);
		this.radio=radio;
		this.altura=altura;		
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public double getVolumenDeMaerial() {
		return Math.PI*Math.pow(this.radio, 2)*this.altura;
	}
	@Override
	public double getSuperficieDeColor() {
		return 2*Math.PI*this.radio*this.altura+2*Math.PI*Math.pow(this.radio, 2);
	}
	
	

}
