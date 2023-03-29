package ar.edu.unlp.info.oo1.parapracticar;

import java.util.ArrayList;
import java.util.List;

public class MainFigura {

	public static void main(String[] args) {
		List<Figura>figuras=new ArrayList<>();
		
		Circulo c = new Circulo("verde","rojo","Circulo");
		Circulo c2 = new Circulo("verde","azulo","Circuolo");
		Cuadrado c1=new Cuadrado("Azulo", "Naranja","Cuadrado");
		figuras.add(c2);
		figuras.add(c1);
		figuras.add(c);
		for(Figura f : figuras) {
			f.Info();
		}
	}

}
