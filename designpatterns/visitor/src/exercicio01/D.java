package exercicio01;

public class D  {
	
	//nome do conceito: SOBRECARGA = o mesmo nome de metodo com modificações obrigatoria
	//na lista de parametros, a modificacao deve ser ou pelo tipo ou pela quantidade de 
	//parametros

	public void foo(B b){
		System.out.println("recebe b");
	}
	public void foo(C c){
		System.out.println("recebe c");
	}

}
