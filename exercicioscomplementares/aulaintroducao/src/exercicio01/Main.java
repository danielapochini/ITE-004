package exercicio01;

public class Main {

	public static void main(String[] args) {
		/*	SEM LAMBDA
		 	==============================
		 	Fundos f = new Fundos(1000.0);
			Fundos j = new Fundos(1000.0);
			f.render();
			f.render();
			//f.imposto(); tem que adicionar a taxa
			
			f.setT(new ComTaxa());
			f.imposto();

			j.setT(new SemTaxa());
			j.imposto();
			
			System.out.println(f.getValor());
			System.out.println(j.getValor());
		 	============================== */
		
			Fundos f = new Fundos (1000.0);
			           /*imitando o SemTaxa
			            lambda, se encaixa no corpo do taxavel
						metodo sem parametro de retorno, double
						como este lambda possui nenhum parametro,
						e retorno double, a referencia Taxavel
						aceitou este metodo! */
			Taxavel t = ()->{
				return 0.8;
			};
			
			f.setT(t); //passando metodo por parametro
			f.imposto();
			System.out.println(f.getValor());
			
			
			//Faça uma calculadora usando LAMBDA
			
			
	}
}
