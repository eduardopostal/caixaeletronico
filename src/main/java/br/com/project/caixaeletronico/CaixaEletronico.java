package br.com.project.caixaeletronico;

import br.com.project.caixaeletronico.casssete.Cassete;
import br.com.project.caixaeletronico.casssete.DispensaCassete;

public class CaixaEletronico {

	private Cassete casseteA = new Cassete(100);
	private Cassete casseteB = new Cassete(50);
	private Cassete casseteC = new Cassete(20);
	private Cassete casseteD = new Cassete(10);

	public DispensaCaixaEletronico sacar(int valor) {

		DispensaCassete dispensaCasseteA = casseteA.dispensarCedulas(valor);
		DispensaCassete dispensaCasseteB = casseteB.dispensarCedulas(dispensaCasseteA.getValorNaoDispensado());
		DispensaCassete dispensaCasseteC = casseteC.dispensarCedulas(dispensaCasseteB.getValorNaoDispensado());
		DispensaCassete dispensaCasseteD = casseteD.dispensarCedulas(dispensaCasseteC.getValorNaoDispensado());

		return new DispensaCaixaEletronico(dispensaCasseteA, dispensaCasseteB, dispensaCasseteC, dispensaCasseteD);
	}

}
