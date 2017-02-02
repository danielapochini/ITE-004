package decorator;

public class PacoteMassagem extends Pacote {

	@Override
	public double calcPreco() {
		return 500;
	}

	@Override
	public String descricao() {
		return "Sess�es de Massagem com Pedras Quentes";
	}

}
