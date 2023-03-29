package ar.edu.unlp.info.oo1.parapracticar;

public abstract class Figura {
	private String colorL;
	private String colorR;
	public Figura(String cl , String cr) {
		this.colorL=cl;
		this.colorR=cr;
	}
	
	public String getColorL() {
		return colorL;
	}
	public void setColorL(String colorL) {
		this.colorL = colorL;
	}
	public String getColorR() {
		return colorR;
	}
	public void setColorR(String colorR) {
		this.colorR = colorR;
	}
	
	public abstract void Info();
}
