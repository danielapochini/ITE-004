package exercicio01;

public class C extends A {

	@Override  
	public void metodo(){
		System.out.println("metodo de C "); 
	}
	
	public void bar(B b){
		System.out.println("Bar em C recebendo " + b.getClass().getSimpleName());  
	}
	
	
	public void bar(C c){ 
		System.out.println("Bar em C recebendo " + c.getClass().getSimpleName());  
	}

}
