package exercicio03;

public class Carro {
	
	private String nome;
	//esse atributo possui o tipo TipoCarro que é um Enum
	private TipoCarro tipo; 
	//limita a aceitar apenas o que está no TipoCarro.java, em String fica muito geral
	
	public Carro(String nome, TipoCarro tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public void mostrarInfo(){
		System.out.println("Nome: " +nome);
		System.out.println("Tipo: " +tipo);
		System.out.println(tipo.getCdBanco()); //codigo do banco de dados
		System.out.println(tipo.getValor());
	}

}
