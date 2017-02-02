package exercicio02;

public class ChecarVisitorZooB extends ChecarVisitor {

		
		public void checar(Cachorro c){
			System.out.println("É um cachorro no ZooB"); //reflection 
		}
		
		public void checar(Gato g){
			System.out.println("É um gato no ZooB"); //reflection 
		}


}
