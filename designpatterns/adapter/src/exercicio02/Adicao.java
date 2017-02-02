package exercicio02;

public class Adicao implements OperacaoSimples{

	@Override
	public String operacao(double a, double b) {
		return "O resultado da soma é: " + String.valueOf(a+b);
	}

}
