package ar.edu.unlp.info.oo1.CuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {
	private CuentaCorriente cuentac;
	@BeforeEach
	void setUp() throws Exception {
		cuentac=new CuentaCorriente();
	}

	@Test
	void testConstructores() {
		assertEquals(0,cuentac.getLimite());
	}
	@Test
	void testCuentaCorriente() {
		cuentac.setLimite(300);
		cuentac.depositar(400);
		assertEquals(300,cuentac.getLimite());
		assertTrue(cuentac.puedeExtraer(200));
	}

}
