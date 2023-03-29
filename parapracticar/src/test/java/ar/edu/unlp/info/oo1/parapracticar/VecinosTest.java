package ar.edu.unlp.info.oo1.parapracticar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VecinosTest {
	private Vecino v1,v2;
	// Una mal inicializacion de las variables puede dar errores 
	// Se quiso comprobar si el vecino de v1 era el vecino que se le asigno
	// al inicializar primero v1 con v2 como vecino se produjo un error
	// ya que v2 no estaba inicializada y se devolvia un null  
	@BeforeEach
	void setUp() throws Exception {
	v2=new Vecino(v1,"Marcos",67);
	v1=new Vecino(v2,"David",68);
	}

	@Test
	void testVecino1() {
		 assertEquals(68,v1.getNumcasa());
		 assertTrue(v1.getVecino().equals(v2));
	}

}
