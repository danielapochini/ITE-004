package exercicio01;

public class ComTaxa implements Taxavel {
//sempre repete os metodos da interface
	
	@Override //verificar se a sobrescrita está boa, bons metodos
	public double calcImposto() {
		 
		return 0.9; //10% de imposto
	}

}
