package trabajadores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class trabajadorTest {
	
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private PorHorasExtras porHora1;
	private Trabajador trabajador1; 
	
	@BeforeEach
	void setUp() throws Exception {
		ingreso1 = new Ingreso(5, "salario", 200);
		ingreso2= new Ingreso(4, "salario", 300);
		porHora1 = new PorHorasExtras(3, "salario", 300, 3);
		trabajador1 = new Trabajador();
	}

	
	
	
	@Test
	void totalPercibidoTest() {
		trabajador1.agregarIngreso(ingreso1);
		trabajador1.agregarIngreso(ingreso2);
		trabajador1.agregarIngreso(porHora1);
		assertEquals(806, trabajador1.getTotalPercibido());
	}
	
	@Test
	void totalMontoImponibleTest() {
		trabajador1.agregarIngreso(ingreso1);
		trabajador1.agregarIngreso(porHora1);
		assertEquals(500, trabajador1.getTotalMontoImponible());
	}
	
	@Test
	void impuestoAPagarTest() {
		trabajador1.agregarIngreso(ingreso1);
		trabajador1.agregarIngreso(porHora1);
		assertEquals(10, trabajador1.getImpuestoAPagar());
	}

}
