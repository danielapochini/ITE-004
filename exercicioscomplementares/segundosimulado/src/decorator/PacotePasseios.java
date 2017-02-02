package decorator;

public class PacotePasseios extends Pacote {

	@Override
	public double calcPreco() {
		return 100;
	}

	@Override
	public String descricao() {
		return "Passeios Extras";
	
	}

}
