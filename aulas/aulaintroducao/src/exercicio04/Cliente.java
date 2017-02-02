package exercicio04;

public class Cliente {
	
	private String nome;
	private TipoCartao tipo; 
	private double anuidade;
	
	public Cliente(String nome, TipoCartao tipo, double anuidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.anuidade = anuidade;
	}
	
	public void mostrarInfo(){
		System.out.println("Nome: " +nome);
		System.out.println("Tipo: " +tipo);
		System.out.println("Anuidade: " +CalcAnuidade());
	}
	
	public double CalcAnuidade(){
		return anuidade * tipo.getAnuidade();
	}
	
}
