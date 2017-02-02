package decorator;

public class ViagemCruzeiro extends Viagem {

	@Override
	public double calcPreco() {
		return 2500;
	}

	@Override
	public String descricao() {
		return "Viagem para Chile";
	}

}
