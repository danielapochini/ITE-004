package exercicio02;

public class ChecarVisitorZooA extends ChecarVisitor{
	
	public void checar(Cachorro c){
		System.out.println("� um cachorro no ZooA"); //reflection 
	}
	
	public void checar(Gato g){
		System.out.println("� um gato no ZooA"); //reflection 
	}

}
