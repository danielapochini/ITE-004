package exercicio01;

public class UsuarioProxy implements Controle {
	private Controle control; 
	//referencia a ele mesmo, pode ser o proxy, user visitante ou user real
	private String user, senha;

	//criar uma classe - Model
	//private Usuario u

	public UsuarioProxy(String user, String senha) {
		this.user = user;
		this.senha = senha;
	}

	//Buscar user e senha do banco
	@Override
	public void operacao() {
		if (user.equals("root") && senha.equals("root")){
			control = new UsuarioReal();
		}else{
			control = new UsuarioVisitante();
		}
		control.operacao();
	}

	//tudo acontece graças ao POLIMORFISMO.
	//pra isso tudo abaixo acontecer precisa do operacao();
	
	@Override
	public void telaPrincipal() {
		control.telaPrincipal();
	}

	@Override
	public void postar() {
		control.postar();
	}

}
