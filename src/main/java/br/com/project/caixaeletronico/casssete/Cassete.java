package br.com.project.caixaeletronico.casssete;

public class Cassete {
	
	private int valorCedula;

	public Cassete(int valorCedulas) {
		this.valorCedula = valorCedulas;
	}
	
	public DispensaCassete dispensarCedulas(int valor) {
		int cedulasDispensadas = valor / valorCedula;
		int valorNaoPossivelDeDispensa = valor % valorCedula;
		
		return new DispensaCassete(valorCedula, cedulasDispensadas, valorNaoPossivelDeDispensa);
		
	}
}
