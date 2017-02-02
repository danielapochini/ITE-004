package exercicio;

public class FabricaPopular implements FabricaCarro {

	@Override
	public Carro criarCarro(String nome, Local localidade) {
		return new Popular(nome, localidade);
	}

}
