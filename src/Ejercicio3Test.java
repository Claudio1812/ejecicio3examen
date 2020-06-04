import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio3Test {

	@Test
	void test() {
		Ejercicio3 herramienta=new Ejercicio3();
		
		assertEquals("lunes", herramienta.diaSemana(1));
		assertEquals("martes", herramienta.diaSemana(2));
		assertEquals("miercoles", herramienta.diaSemana(3));
		assertEquals("jueves", herramienta.diaSemana(4));
		assertEquals("viernes", herramienta.diaSemana(5));
		assertEquals("sabado", herramienta.diaSemana(6));
		assertEquals("domingo", herramienta.diaSemana(7));
		assertEquals("ERROR!", herramienta.diaSemana(10));


	}

}
