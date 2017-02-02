package exercicio01;

public class FabricaPuma implements FabricaBola {

	@Override
	public Bola criarBola(String nome, Cor cor, String material) {
		return new Puma(nome, cor, material);
	}

}
