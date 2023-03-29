package ar.edu.unlp.info.oo1.parapracticar;

public class MainEscuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Direccion dir = new Direccion (238 , 67);
		Escuela e=new Escuela ("ES 61",dir);
		Alumno a=new Alumno("Marcos","matias");
		Alumno a2=new Alumno("David","matias");
		Salon s=new Salon(1);
		s.setAlumnos(a2);
		s.setAlumnos(a);
		Salon s2=new Salon(2);
		s2.setAlumnos(new Alumno("Brian","Poma"));
		e.setSalones(s);
		e.setSalones(s2);
		for(Salon  salon : e.getsalones()) {
			System.out.println("Alumnos del salon : " + salon.getNumero());
			for(Alumno alumno : salon.getAlumnos()) {
				System.out.println(alumno.getApellido() + alumno.getNombre());
			}
		}
		*/
		
		SalonA sa = new SalonA();
		Alumno a=new Alumno("david","Matias");
		Alumno a2=new Alumno("david","poma");
		sa.setAlumnos(a);
		sa.setAlumnos(a2);
		for(SalonA s : s.getAlumnos() ) {
			System.out.println(s.);
		}
	}

}
