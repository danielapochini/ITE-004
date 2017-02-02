package decorator;

public class ViagemPraia extends Viagem {

	@Override
	public double calcPreco() {
		return 800;
	}

	@Override
	public String descricao() {
		return "Viagem para o Litoral Norte";
	}

}
