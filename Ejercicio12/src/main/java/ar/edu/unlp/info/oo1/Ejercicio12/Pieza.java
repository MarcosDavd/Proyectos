package ar.edu.unlp.info.oo1.Ejercicio12;

public abstract class Pieza {
	private String material;
	private String color;
	public Pieza(String material,String color) {
		this.color=color;
		this.material=material;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract double getVolumenDeMaerial();
	public abstract double getSuperficieDeColor();
}
