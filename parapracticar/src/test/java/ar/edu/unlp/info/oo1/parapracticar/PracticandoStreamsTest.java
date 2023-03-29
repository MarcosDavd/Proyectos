package ar.edu.unlp.info.oo1.parapracticar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PracticandoStreamsTest {
	private Persona p1;
	private Persona p2;
	private Persona p3;
	private Persona p4;
	private PracticandoStreams pr;
	@BeforeEach
	void setUp() throws Exception {
		p1=new Persona("David",21);
		p2=new Persona("Marcos",28);
		p3=new Persona("Brian",22);
		p4=new Persona("Matias",101);
		pr=new PracticandoStreams();
	}

	@Test
	void testLista() {
		pr.agregarPersona(p1);
		pr.agregarPersona(p4);
		pr.agregarPersona(p2);
		pr.agregarPersona(p3);
		
		assertEquals(4,pr.getPersonas().size());
		assertEquals(p1,pr.getPersonas().get(0));
	}
	@Test
	void testmayorDeCienAnios() {
		pr.agregarPersona(p1);
		pr.agregarPersona(p4);
		pr.agregarPersona(p2);
		pr.agregarPersona(p3);
		assertEquals(p4,pr.mayorDeCienAnios());
	}

}