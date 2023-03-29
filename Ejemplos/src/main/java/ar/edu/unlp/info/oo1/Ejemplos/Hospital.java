package ar.edu.unlp.info.oo1.Ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hospital {
	private List<Personas> pacientes=new ArrayList<>();
	
	public void agregarPacientes(Personas p) {
		pacientes.add(p);
	}
	public List<String> getNombres(){
		 List<String>nombres= this.pacientes.stream().map(p -> p.getNombre()).collect(Collectors.toList());
		 return nombres;
	}
	public  void getmayoredad(){
		 List<int>edades = this.pacientes.stream().mapToInt(p -> p.getEdad());
	}
}
