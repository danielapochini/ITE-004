package exercicio02;

public class Main {

	public static void main(String[] args) throws Exception {
		OperacaoSimples a = new Adicao();
		System.out.println(a.operacao(6, 7));
		OperacaoSimples d = new Divisao();
		System.out.println(d.operacao(1, 2));
		OperacaoSimples e = new OperacaoAdapter();
		((OperacaoAdapter) e).setEq(new EquacaoSegundo());
		System.out.println(e.operacao(0, -9));
	}

}
