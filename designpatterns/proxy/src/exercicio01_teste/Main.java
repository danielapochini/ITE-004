package exercicio01_teste;

import exercicio01.UsuarioProxy;

public class Main {

	public static void main(String[] args) {
		UsuarioProxy a = new UsuarioProxy("root", "root");
		a.operacao();
		a.postar();
		a.telaPrincipal();
	}
}
