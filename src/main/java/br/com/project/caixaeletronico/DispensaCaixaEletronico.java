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

	/**
	 * Verifica se no último cassete existe algum valor
	 * não dispensado. Caso exista algum valor, significa
	 * que não foi possível dispensar todo o valor solicitado.
	 */
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DispensaCaixaEletronico other = (DispensaCaixaEletronico) obj;
		if (dispensaCasseteA == null) {
			if (other.dispensaCasseteA != null)
				return false;
		} else if (!dispensaCasseteA.equals(other.dispensaCasseteA))
			return false;
		if (dispensaCasseteB == null) {
			if (other.dispensaCasseteB != null)
				return false;
		} else if (!dispensaCasseteB.equals(other.dispensaCasseteB))
			return false;
		if (dispensaCasseteC == null) {
			if (other.dispensaCasseteC != null)
				return false;
		} else if (!dispensaCasseteC.equals(other.dispensaCasseteC))
			return false;
		if (dispensaCasseteD == null) {
			if (other.dispensaCasseteD != null)
				return false;
		} else if (!dispensaCasseteD.equals(other.dispensaCasseteD))
			return false;
		return true;
	}
	
	
	
}
