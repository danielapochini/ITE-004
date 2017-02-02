package exercicio01;

public class SemTaxa implements Taxavel {
//sempre repete os metodos da interface
	
	@Override //verificar se a sobrescrita está boa, bons metodos
	public double calcImposto() {
		 
		return 1; //nao pode ser 0 se nao nada acontece
	}

}
