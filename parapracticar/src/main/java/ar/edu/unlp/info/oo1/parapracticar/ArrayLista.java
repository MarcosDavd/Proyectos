package ar.edu.unlp.info.oo1.parapracticar;

import java.util.ArrayList;
import java.util.List;

public class ArrayLista {

	public static void main(String[] args) {
		List<Estudiante> numeros = new ArrayList<> ();
		List <Estudiante> numeros2 = new ArrayList<> ();
		Estudiante e1 = new Estudiante("Marcos",001);
		Estudiante e2 = new Estudiante("David",100);
		numeros.add(e1);
		numeros.add(e2);
		for (Estudiante es : numeros) {
			System.out.println("nombre del estuiante :"+numeros.size() + es.getNombre());
		}
	}

}
