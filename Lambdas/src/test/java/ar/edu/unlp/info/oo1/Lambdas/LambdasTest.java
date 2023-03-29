package ar.edu.unlp.info.oo1.Lambdas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdasTest {
	private Alumno a1,a2,a3;
	private Lambdas l,l2;
	private List<Alumno>al2;
	@BeforeEach
	void setUp() throws Exception {
		l=new Lambdas();
		l2=new Lambdas();
		al2=new ArrayList<>();
		a1=new Alumno("David",21,3,6.6,"Lic. en Info");
		a2=new Alumno("Brian",21,2,7.6,"Lic. en Sis");
		a3=new Alumno("Marcos",21,4,5.6,"APU");
	}

	@Test
	void testListas() {
		l.agregarAlumno(a1);
		l.agregarAlumno(a3);
		l.agregarAlumno(a2);
		int t=l.lista1().size();
		al2=l.lista1().stream().sorted((aa,ab)-> ab.getNombre().compareTo(aa.getNombre())).collect(Collectors.toList());
		al2.stream().forEach(a -> System.out.println(a.getNombre()));
	
	}

}
