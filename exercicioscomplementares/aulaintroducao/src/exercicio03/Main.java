package exercicio03;

public class Main {
 public static void main(String[] args) {
		/*teste 1
		TipoCarro t = TipoCarro.LUXO;
		System.out.println(t);
		System.out.println(t.ordinal()); -- numero correspondente ao titulo */		
		
	 	/*Carro C = new Carro("Honda Civic", TipoCarro.SEDAN); //barrará de colocar String
		C.mostrarInfo();*/

	 	//Carro C = new Carro ("Honda Civic", TipoCarro.getTipo(2));
	 
	 
	 /* TESTE 2
	 	Carro C = new Carro ("Honda Civic", TipoCarro.values()[0]);
	 	C.mostrarInfo();
	 	
	 	*/
	 
	 Animal A = Animal.valueOf("CAT");
	 
	 A.emitirSom();
	 	
	}
}
