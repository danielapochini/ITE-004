package exercicio02;

abstract public class Animal {
	private String nome;
	
	public Animal(String nome){
		this.nome = nome;
	}

	abstract public void emitirSom();
	
	public String getNome(){
		return nome;
	}
	abstract public void accept(ChecarVisitor z);
	
}
