package exercicio03;
import java.util.HashMap;


public enum TipoCarro {
	LUXO(135, 2050.20), SEDAN(249, 168.20), HATCH(542, 400.65);
	
	private int cdBanco;
	private double valor;
	private static HashMap<Integer, TipoCarro> hs; 
	
	private TipoCarro(int cdBanco, double valor) {
		this.cdBanco = cdBanco;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

	public int getCdBanco() {
		return cdBanco;
	}
	
	public static void gerarMapa() {
		//primeiro parametro vem de fora
		//pode ser do combo box, bd, etc...
		// hs = new HashMap<Integer, TipoCarro>();
		TipoCarro[] tc = TipoCarro.values(); //pega todos os values e constructors
		
		for (int i=0; i < tc.length; i++){
			hs.put(i, tc[i]);
		}
	}

	public static TipoCarro getTipo(int x){
		return hs.get(x); //hs mapeado no gerarMapa
	}
}
