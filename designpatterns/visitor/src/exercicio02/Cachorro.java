package exercicio02;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome); 
	}

	@Override
	public void emitirSom() {
		System.out.println("au au au");		
	}

	@Override
	public void accept(ChecarVisitor z) {// no accept ele passa ele mesmo
		z.checar(this);//aqui
	}

}
