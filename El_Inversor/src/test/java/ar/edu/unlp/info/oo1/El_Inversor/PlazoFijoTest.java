package ar.edu.unlp.info.oo1.El_Inversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlazoFijoTest {
	private PlazoFijo plazofijo ;
	LocalDate dia =LocalDate.of(2022,Month.NOVEMBER,18);
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		plazofijo=new PlazoFijo(25000,1,dia);
	}

	@Test
	void testPlazoFijo() {
	assertEquals(dia,plazofijo.getFechaDeConstitucion());
	}

	@Test
	void testValorActual() {
		assertEquals(26000 , plazofijo.valorActual());
	}

}
