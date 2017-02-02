package exercicio01;

public class UsuarioReal implements Controle {
	UsuarioReal(){}
	
	@Override
	public void operacao() {
		System.out.println("Operação feita por um usuario autorizado");

	}

	@Override
	public void telaPrincipal() {
		System.out.println("Tela principal do usuario real");

	}

	@Override
	public void postar() {
		System.out.println("Post de um usuário real");

	}

}
