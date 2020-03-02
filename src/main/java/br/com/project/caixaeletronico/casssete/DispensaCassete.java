package br.com.project.caixaeletronico.casssete;

public class DispensaCassete {

	private int valorCedula;
	private int numeroCedulasDispensadas;
	private int valorNaoDispensado;
	
	public DispensaCassete(int valorCedula, int numeroCedulasDispensadas, int valorNaoDispensado) {
		this.valorCedula = valorCedula;
		this.numeroCedulasDispensadas = numeroCedulasDispensadas;
		this.valorNaoDispensado = valorNaoDispensado;
	}
	
	public int getValorCedula() {
		return valorCedula;
	}

	public int getNumeroCedulasDispensadas() {
		return numeroCedulasDispensadas;
	}

	public int getValorNaoDispensado() {
		return valorNaoDispensado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DispensaCassete other = (DispensaCassete) obj;
		if (numeroCedulasDispensadas != other.numeroCedulasDispensadas)
			return false;
		if (valorCedula != other.valorCedula)
			return false;
		if (valorNaoDispensado != other.valorNaoDispensado)
			return false;
		return true;
	}

}
