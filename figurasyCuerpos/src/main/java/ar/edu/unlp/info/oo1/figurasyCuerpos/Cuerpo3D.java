package ar.edu.unlp.info.oo1.figurasyCuerpos;

public class Cuerpo3D {
	private Figura carabasal;
	private double altura;
	public Cuerpo3D() {}
	public void setAltura(double altura) {
		this.altura=altura;
		
	}
	public double getAltura() {
		
		return this.altura;
	}

	public void setCaraBasal(Figura carabasal) {
		// TODO Auto-generated method stub
		this.carabasal=carabasal;
	}

	public double getSuperficieExterior() {
		// 2* área-cara-basal + perímetro-cara-basal * altura-del-cuerpo
		return (2 * this.carabasal.getArea()) + (this.carabasal.getPerimetro() * this.altura);
	}

	public double getVolumen() {
		// ●	El volumen de un cuerpo es: área-cara-basal * altura
		return this.carabasal.getArea()*this.altura;
	}

}
