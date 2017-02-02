package decorator;

public class Main {

	public static void main(String[] args) {
		ViagemCampo c = new ViagemCampo();
		PacotePasseios p = new PacotePasseios();
		p.setPacoteAdc(c);
		System.out.println("Valor do Contrato:" + (p.calcPreco() + c.calcPreco()));
		System.out.println("Viagem para: " +c.descricao() + "\n" + "Pacote Adicional: " +p.descricao());
	}
}
