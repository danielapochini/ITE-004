package exercicio01;

public class B extends A {
	
	@Override  
	public void metodo(){
		System.out.println("metodo de B"); 
	}
	
	public void bar(B b){
		System.out.println("Bar em B recebendo " + b.getClass().getSimpleName()); 
	}
	
	
	public void bar(C c){
		System.out.println("Bar em B recebendo " + c.getClass().getSimpleName()); 
	}

}
