package exercicio;

public class FabricaSedan implements FabricaCarro{

	@Override
	public Carro criarCarro(String nome, Local localidade) {
		return new Sedan(nome, localidade);
	}

}
