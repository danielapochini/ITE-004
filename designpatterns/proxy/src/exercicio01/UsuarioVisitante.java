package exercicio01;

public class UsuarioVisitante implements Controle {
	//Visibilidade do mesmo pacote - default
	UsuarioVisitante() {}
	@Override
	public void operacao() {
		System.out.println("Credenciais inv�lidas");

	}

	@Override
	public void telaPrincipal() {
		System.out.println("Tela do visitante");

	}

	@Override
	public void postar() {
		System.out.println("Erro - voc� n�o est� logado");
		System.out.println("Redirect para o erro");
	}

}
