package decorator;

public class PacoteBebidas extends Pacote {

	@Override
	public double calcPreco() {
		return 250;
	}

	@Override
	public String descricao() {
		return "Pacote Open Bar";
	}

}
