package br.com.project.caixaeletronico.cassete;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.com.project.caixaeletronico.casssete.Cassete;
import br.com.project.caixaeletronico.casssete.DispensaCassete;

public class CasseteTest {
	
	@Test
	public void dispensarCedulasTest() {
		Cassete cassete = new Cassete(100);
		
		DispensaCassete dispensa = cassete.dispensarCedulas(120);
		DispensaCassete dispensaEsperada = new DispensaCassete(100, 1, 20);
		assertEquals(dispensaEsperada, dispensa);
		
		dispensa = cassete.dispensarCedulas(600);
		dispensaEsperada = new DispensaCassete(100, 6, 0);
		assertEquals(dispensaEsperada, dispensa);
		
		dispensa = cassete.dispensarCedulas(5);
		dispensaEsperada = new DispensaCassete(100, 0, 5);
		assertEquals(dispensaEsperada, dispensa);
		
		dispensa = cassete.dispensarCedulas(0);
		dispensaEsperada = new DispensaCassete(100, 0, 0);
		assertEquals(dispensaEsperada, dispensa);
	}

}
