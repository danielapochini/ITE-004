package exercicio;


abstract public class Carro {
	private String nome;
	private Local localidade;
	
	Carro(String nome, Local localidade) {
		this.nome = nome;
		this.localidade = localidade;
	}
	
	@Override
	public String toString(){
		return "Nome: " + nome + " Localidade: " + localidade;
	}
}
