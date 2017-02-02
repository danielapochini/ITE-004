package exercicio01_teste;

import exercicio01.Bola;
import exercicio01.FabricaFabrica;

public class Main {
	public static void main(String[] args) {
		Bola c = FabricaFabrica.ADIDAS.fabricarBola(); 
		System.out.println(c);
	}
}
