package exercicio;


public class FabricaLuxo implements FabricaCarro{

	@Override
	public Carro criarCarro(String nome, Local localidade) {
		return new Luxo(nome, localidade);
	}

}
