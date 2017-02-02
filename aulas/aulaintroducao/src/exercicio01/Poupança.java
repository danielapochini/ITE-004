package exercicio01;

public class Poupança extends Investimento {

	public Poupança(double valor) {
		super(valor);
	 
	}

	@Override
	public void render() {
	 		valor = valor * 1.006;
	}

}
