package decorator;

public class ViagemCampo extends Viagem {

	@Override
	public double calcPreco() {
		return 1000;
	}

	@Override
	public String descricao() {
		return "Viagem para Campos do Jordão";
	}

}
