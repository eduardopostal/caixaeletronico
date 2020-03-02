package br.com.project.caixaeletronico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.project.caixaeletronico.casssete.DispensaCassete;

public class CaixaEletronicoTest {

	@Test
	public void sacarTest() {
		cenarioComSaque();
		cenarioSemSaque();
	}
	
	private void cenarioComSaque() {
		CaixaEletronico cxeletro = new CaixaEletronico();
		DispensaCaixaEletronico dispensaCxeletro = cxeletro.sacar(310);

		DispensaCassete dispensaEsperadaCasseteA = new DispensaCassete(100, 3, 10);
		DispensaCassete dispensaEsperadaCasseteB = new DispensaCassete(50, 0, 10);
		DispensaCassete dispensaEsperadaCasseteC = new DispensaCassete(20, 0, 10);
		DispensaCassete dispensaEsperadaCasseteD = new DispensaCassete(10, 1, 0);
		DispensaCaixaEletronico dispensaEsperadaCxeletro = new DispensaCaixaEletronico(dispensaEsperadaCasseteA,
				dispensaEsperadaCasseteB, dispensaEsperadaCasseteC, dispensaEsperadaCasseteD);

		assertEquals(true, dispensaCxeletro.dispensaRealizadaComSucesso());
		assertEquals(dispensaEsperadaCxeletro, dispensaCxeletro);
	}
	
	private void cenarioSemSaque() {
		CaixaEletronico cxeletro = new CaixaEletronico();
		DispensaCaixaEletronico dispensaCxeletro = cxeletro.sacar(1);

		DispensaCassete dispensaEsperadaCasseteA = new DispensaCassete(100, 0, 1);
		DispensaCassete dispensaEsperadaCasseteB = new DispensaCassete(50, 0, 1);
		DispensaCassete dispensaEsperadaCasseteC = new DispensaCassete(20, 0, 1);
		DispensaCassete dispensaEsperadaCasseteD = new DispensaCassete(10, 0, 1);
		DispensaCaixaEletronico dispensaEsperadaCxeletro = new DispensaCaixaEletronico(dispensaEsperadaCasseteA,
				dispensaEsperadaCasseteB, dispensaEsperadaCasseteC, dispensaEsperadaCasseteD);

		assertEquals(false, dispensaCxeletro.dispensaRealizadaComSucesso());
		assertEquals(dispensaEsperadaCxeletro, dispensaCxeletro);
	}
			
			

}
