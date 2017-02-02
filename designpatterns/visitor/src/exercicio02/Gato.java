package exercicio02;

public class Gato extends Animal {

	public Gato(String nome) {
		super(nome); 
	}

	@Override
	public void emitirSom() {
		System.out.println("miau");
	}

	@Override
	public void accept(ChecarVisitor z) {
		z.checar(this);
		
	}

}
