package exercicio01;

public class Poupan�a extends Investimento {

	public Poupan�a(double valor) {
		super(valor);
	 
	}

	@Override
	public void render() {
	 		valor = valor * 1.006;
	}

}
