package exercicio01;

public class UsuarioReal implements Controle {
	UsuarioReal(){}
	
	@Override
	public void operacao() {
		System.out.println("Opera��o feita por um usuario autorizado");

	}

	@Override
	public void telaPrincipal() {
		System.out.println("Tela principal do usuario real");

	}

	@Override
	public void postar() {
		System.out.println("Post de um usu�rio real");

	}

}
