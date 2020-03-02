package br.com.project.caixaeletronico;

public class Application {

	public static void main(String[] args) {
		CaixaEletronico cxeletro = new CaixaEletronico();
		DispensaCaixaEletronico dispensaCxeletro = cxeletro.sacar(260);
		imprime(dispensaCxeletro);
	}

	private static void imprime(DispensaCaixaEletronico dispensa) {
		System.out.format("[Nota %3d]: %d\n", dispensa.getDispensaCasseteA().getValorCedula(), dispensa.getDispensaCasseteA().getNumeroCedulasDispensadas());
		System.out.format("[Nota %3d]: %d\n", dispensa.getDispensaCasseteB().getValorCedula(), dispensa.getDispensaCasseteB().getNumeroCedulasDispensadas());
		System.out.format("[Nota %3d]: %d\n", dispensa.getDispensaCasseteC().getValorCedula(), dispensa.getDispensaCasseteC().getNumeroCedulasDispensadas());
		System.out.format("[Nota %3d]: %d\n", dispensa.getDispensaCasseteD().getValorCedula(), dispensa.getDispensaCasseteD().getNumeroCedulasDispensadas());
	}

}
