package br.com.project.caixaeletronico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.project.caixaeletronico.casssete.DispensaCassete;

public class CaixaEletronicoTest {
	
	private static final int CEDULA_A = 100;
	private static final int CEDULA_B = 50;
	private static final int CEDULA_C = 20;
	private static final int CEDULA_D = 10;
	

	@Test
	public void sacarTest() {
		cenarioComSaque();
		cenarioSemSaque();
	}
	
	private void cenarioComSaque() {
		CaixaEletronico cxeletro = new CaixaEletronico(CEDULA_A, CEDULA_B, CEDULA_C, CEDULA_D);
		DispensaCaixaEletronico dispensaCxeletro = cxeletro.sacar(310);

		DispensaCassete dispensaEsperadaA = new DispensaCassete(CEDULA_A, 3, 10);
		DispensaCassete dispensaEsperadaB = new DispensaCassete(CEDULA_B, 0, 10);
		DispensaCassete dispensaEsperadaC = new DispensaCassete(CEDULA_C, 0, 10);
		DispensaCassete dispensaEsperadaD = new DispensaCassete(CEDULA_D, 1, 0);
		DispensaCaixaEletronico dispensaEsperadaCxeletro = new DispensaCaixaEletronico(dispensaEsperadaA,
				dispensaEsperadaB, dispensaEsperadaC, dispensaEsperadaD);

		assertEquals(true, dispensaCxeletro.dispensaRealizadaComSucesso());
		assertEquals(dispensaEsperadaCxeletro, dispensaCxeletro);
	}
	
	private void cenarioSemSaque() {
		CaixaEletronico cxeletro = new CaixaEletronico(CEDULA_A, CEDULA_B, CEDULA_C, CEDULA_D);
		DispensaCaixaEletronico dispensaCxeletro = cxeletro.sacar(1);

		DispensaCassete dispensaEsperadaA = new DispensaCassete(CEDULA_A, 0, 1);
		DispensaCassete dispensaEsperadaB = new DispensaCassete(CEDULA_B, 0, 1);
		DispensaCassete dispensaEsperadaC = new DispensaCassete(CEDULA_C, 0, 1);
		DispensaCassete dispensaEsperadaD = new DispensaCassete(CEDULA_D, 0, 1);
		DispensaCaixaEletronico dispensaEsperadaCxeletro = new DispensaCaixaEletronico(dispensaEsperadaA,
				dispensaEsperadaB, dispensaEsperadaC, dispensaEsperadaD);

		assertEquals(false, dispensaCxeletro.dispensaRealizadaComSucesso());
		assertEquals(dispensaEsperadaCxeletro, dispensaCxeletro);
	}
			
			

}
