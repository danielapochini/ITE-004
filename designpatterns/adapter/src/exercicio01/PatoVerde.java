package exercicio01;

public class PatoVerde implements Pato{

	@Override
	public void grasnar() {
		System.out.println("Quack quack como pato verde");
	}

	@Override
	public void voar() {
		System.out.println("Voou como pato verde");
	}

}
