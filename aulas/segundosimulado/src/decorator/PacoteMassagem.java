package decorator;

public class PacoteMassagem extends Pacote {

	@Override
	public double calcPreco() {
		return 500;
	}

	@Override
	public String descricao() {
		return "Sessões de Massagem com Pedras Quentes";
	}

}
