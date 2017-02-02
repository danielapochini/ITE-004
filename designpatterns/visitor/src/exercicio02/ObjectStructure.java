package exercicio02;

import java.util.ArrayList;

public class ObjectStructure {
	
	private ArrayList<Animal> v;
	
	public ObjectStructure(){
		v = new ArrayList<Animal>();
	}
	
	public void adicionar(Animal a){
		v.add(a);
	}
	
	public void acceptAll(ChecarVisitor z){
		for (Animal a: v){
			a.accept(z);
		}
	} 
}
