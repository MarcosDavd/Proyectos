package ar.edu.unlp.info.oo1.parapracticar;

public class Circulo extends Figura {
	private String soy;
	public Circulo(String cl, String cr, String soy) {
		super(cl, cr);
		this.soy=soy;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void Info() {
		System.out.println("Soy "+this.getSoy()+"CR : "+this.getColorR()+" CL :"+ this.getColorL());
		
	}


	private String getSoy() {
		// TODO Auto-generated method stub
		return this.soy;
	}
	
}
