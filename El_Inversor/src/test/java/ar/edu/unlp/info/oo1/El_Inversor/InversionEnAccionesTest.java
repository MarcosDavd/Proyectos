package ar.edu.unlp.info.oo1.El_Inversor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversionEnAccionesTest {
	private InversionEnAcciones inversionenacciones;
	@BeforeEach
	void setUp() throws Exception {
		inversionenacciones = new InversionEnAcciones("facebook",5,3.250);
	}

	@Test
	void test() {
	}
	@Test
	void testInversionEnAcciones() {
		assertTrue("facebook".equals(inversionenacciones.getNombre()));
		assertEquals(5,inversionenacciones.getCantidad());
		assertEquals(3.250,inversionenacciones.getValorunitario());
		assertTrue(this.inversionenacciones.equals(inversionenacciones));
	}
	@Test
	void TestValorActual() {
		assertEquals((5*3.250),inversionenacciones.valorActual());
	}

}
