package ar.edu.unlp.info.oo1.parapracticar;

public class Vecindario {

	public static void main(String[] args) {
		Vecino v1=new Vecino("Marcos",67);
		Vecino v3=new Vecino("David",68);
		Vecino v2=new Vecino("Brian",69);
		
		v3.setVecino(v1);
		v1.setVecino(v2);
		for(Vecino v : v1.getVecinos()) {
			System.out.println(v.getNombre());
			System.out.println(v.getNumcasa());
		}
		
	}

}
