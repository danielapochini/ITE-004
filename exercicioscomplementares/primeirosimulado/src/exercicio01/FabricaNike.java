package exercicio01;

public class FabricaNike implements FabricaBola {

	@Override
	public Bola criarBola(String nome, Cor cor, String material) {
		return new Nike(nome, cor, material);
	}

}
