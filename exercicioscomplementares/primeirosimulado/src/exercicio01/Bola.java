package exercicio01;

public abstract class Bola {
	private String nome;
	private Cor cor;
	private String material;
	
	public Bola(String nome, Cor cor, String material) {
		this.nome = nome;
		this.cor = cor;
		this.material = material;
	}

	@Override
	public String toString(){
		return "Nome: " + nome + "\n" + "Cor: " + cor + "\n" + "Material: " +material;
	}

}
