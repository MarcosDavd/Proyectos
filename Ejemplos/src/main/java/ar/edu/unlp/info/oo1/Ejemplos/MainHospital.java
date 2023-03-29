package ar.edu.unlp.info.oo1.Ejemplos;

public class MainHospital {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		Personas p1= new Personas ("marcos","p",12,12) ;
		Personas p2= new Personas ("David","p",12,12);
		Personas p3= new Personas ("koda","p",12,12);	
		Personas p4= new Personas ("ona","p",12,12);
		
		h.agregarPacientes(p4);
		h.agregarPacientes(p2);
		h.agregarPacientes(p1);
		h.agregarPacientes(p3);
		
		for(String nombres: h.getNombres()){
			System.out.println(nombres);
		}

	}

}
