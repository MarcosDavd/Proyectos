package ar.edu.unlp.info.oo1.parapracticar;

public class Cuadrado extends Figura {
	private String soy;
	public Cuadrado(String cl, String cr , String soy) {
		super(cl, cr);
		this.soy=soy;
		// TODO Auto-generated constructor stub
	}
	
	public String getSoy() {
		return this.soy;
	}
	@Override
	public void Info() {
		System.out.println("Soy "+this.getSoy()+"CR : "+this.getColorR()+" CL :"+ this.getColorL());
		
	}
	

}
