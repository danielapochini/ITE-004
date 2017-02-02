package main;

import exercicio.Carro;
import exercicio.FabricaFabrica;

public class Main {

	public static void main(String[] args) {
		Carro c = FabricaFabrica.LUXO.fabricarCarro();
		System.out.println(c);
	}

}
