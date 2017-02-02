package exercicio01;

public class Fundos extends Investimento {

	public Fundos(double valor) {
		super(valor);
	}

	@Override
	public void render() {
		 valor = valor * (1+Math.random());
	}


}
