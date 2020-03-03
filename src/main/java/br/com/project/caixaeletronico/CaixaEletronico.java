package br.com.project.caixaeletronico;

import br.com.project.caixaeletronico.casssete.Cassete;
import br.com.project.caixaeletronico.casssete.DispensaCassete;

public class CaixaEletronico {

	private Cassete casseteA;
	private Cassete casseteB;
	private Cassete casseteC;
	private Cassete casseteD;

	public CaixaEletronico(int cedulaCasseteA, int cedulaCasseteB, int cedulaCasseteC, int cedulaCasseteD) {
		casseteA = new Cassete(cedulaCasseteA);
		casseteB = new Cassete(cedulaCasseteB);
		casseteC = new Cassete(cedulaCasseteC);
		casseteD = new Cassete(cedulaCasseteD);
	}

	public DispensaCaixaEletronico sacar(int valor) {

		DispensaCassete dispensaCasseteA = casseteA.dispensarCedulas(valor);
		DispensaCassete dispensaCasseteB = casseteB.dispensarCedulas(dispensaCasseteA.getValorNaoDispensado());
		DispensaCassete dispensaCasseteC = casseteC.dispensarCedulas(dispensaCasseteB.getValorNaoDispensado());
		DispensaCassete dispensaCasseteD = casseteD.dispensarCedulas(dispensaCasseteC.getValorNaoDispensado());

		return new DispensaCaixaEletronico(dispensaCasseteA, dispensaCasseteB, dispensaCasseteC, dispensaCasseteD);
	}

}
