package exercicio02;

public class ChecarVisitorZooA extends ChecarVisitor{
	
	public void checar(Cachorro c){
		System.out.println("É um cachorro no ZooA"); //reflection 
	}
	
	public void checar(Gato g){
		System.out.println("É um gato no ZooA"); //reflection 
	}

}
