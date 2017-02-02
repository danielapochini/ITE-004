package exercicio01;

public abstract class A {
	
	public void metodo(){
		System.out.println("Metodo de A");
	}
	
	public void bar(B b){
		System.out.println("Bar em A recebendo " + b.getClass().getSimpleName()); //reflection 
	}
	
	
	public void bar(C c){
		System.out.println("Bar em A recebendo " + c.getClass().getSimpleName()); //reflection 
	}

}
