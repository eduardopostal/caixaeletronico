package br.com.project.caixaeletronico;

import br.com.project.caixaeletronico.casssete.DispensaCassete;

public class DispensaCaixaEletronico {

	private DispensaCassete dispensaCasseteA;
	private DispensaCassete dispensaCasseteB;
	private DispensaCassete dispensaCasseteC;
	private DispensaCassete dispensaCasseteD;
	
	
	public DispensaCaixaEletronico(DispensaCassete dispensaCasseteA, DispensaCassete dispensaCasseteB,
			DispensaCassete dispensaCasseteC, DispensaCassete dispensaCasseteD) {
		super();
		this.dispensaCasseteA = dispensaCasseteA;
		this.dispensaCasseteB = dispensaCasseteB;
		this.dispensaCasseteC = dispensaCasseteC;
		this.dispensaCasseteD = dispensaCasseteD;
	}

	public boolean dispensaRealizadaComSucesso() {
		return dispensaCasseteD.getValorNaoDispensado() == 0;
	}

	public DispensaCassete getDispensaCasseteA() {
		return dispensaCasseteA;
	}

	public DispensaCassete getDispensaCasseteB() {
		return dispensaCasseteB;
	}

	public DispensaCassete getDispensaCasseteC() {
		return dispensaCasseteC;
	}

	public DispensaCassete getDispensaCasseteD() {
		return dispensaCasseteD;
	}
	
}
