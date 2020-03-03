package br.com.project.caixaeletronico;

public class Application {

	private static final String IMPRESSAO_QUANTIDADE_NOTAS = "[Nota %3d]: %d\n";
	private static final String SAQUE_NAO_REALIZADO = "Saque não realizado";
	private static final String VALOR_INVALIDO = "Valor inválido";

	public static void main(String[] args) {

		int saque = leValor(args[0]);

		if (saqueValido(saque)) {
			CaixaEletronico caixaeletronico = new CaixaEletronico(100, 50, 20, 10);

			DispensaCaixaEletronico dispensaCxeletro = caixaeletronico.sacar(saque);

			if (dispensaCxeletro.dispensaRealizadaComSucesso()) {
				imprimeDispensa(dispensaCxeletro);
			} else {
				imprimeErro();
			}
		}
	}

	private static int leValor(String stringValor) {
		int saque = 0;
		try {
			saque = Integer.parseInt(stringValor);
		} catch (NumberFormatException exception) {
			System.out.println(VALOR_INVALIDO);
		}
		return saque;
	}

	private static boolean saqueValido(int saque) {
		return saque > 0;
	}

	private static void imprimeErro() {
		System.out.println(SAQUE_NAO_REALIZADO);
	}

	private static void imprimeDispensa(DispensaCaixaEletronico dispensa) {
		System.out.format(IMPRESSAO_QUANTIDADE_NOTAS, dispensa.getDispensaCasseteA().getValorCedula(),
				dispensa.getDispensaCasseteA().getNumeroCedulasDispensadas());

		System.out.format(IMPRESSAO_QUANTIDADE_NOTAS, dispensa.getDispensaCasseteB().getValorCedula(),
				dispensa.getDispensaCasseteB().getNumeroCedulasDispensadas());

		System.out.format(IMPRESSAO_QUANTIDADE_NOTAS, dispensa.getDispensaCasseteC().getValorCedula(),
				dispensa.getDispensaCasseteC().getNumeroCedulasDispensadas());

		System.out.format(IMPRESSAO_QUANTIDADE_NOTAS, dispensa.getDispensaCasseteD().getValorCedula(),
				dispensa.getDispensaCasseteD().getNumeroCedulasDispensadas());
	}

}
