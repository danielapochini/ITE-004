package exercicio01;

public class UsuarioVisitante implements Controle {
	//Visibilidade do mesmo pacote - default
	UsuarioVisitante() {}
	@Override
	public void operacao() {
		System.out.println("Credenciais inválidas");

	}

	@Override
	public void telaPrincipal() {
		System.out.println("Tela do visitante");

	}

	@Override
	public void postar() {
		System.out.println("Erro - você não está logado");
		System.out.println("Redirect para o erro");
	}

}
