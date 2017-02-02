package exercicio01;

public class FabricaAdidas implements FabricaBola {

	@Override
	public Bola criarBola(String nome, Cor cor, String material) {
		return new Adidas(nome, cor, material);
	}


}
