package br.com.project.caixaeletronico.casssete;

public class Cassete {
	
	private int valorCedulas;

	public Cassete(int valorCedulas) {
		this.valorCedulas = valorCedulas;
	}
	
	public DispensaCassete dispensarCedulas(int valor) {
		int cedulasDispensadas = valor / valorCedulas;
		int valorNaoPossivelDeDispensa = valor % valorCedulas;
		
		return new DispensaCassete(valorCedulas, cedulasDispensadas, valorNaoPossivelDeDispensa);
		
	}
}
