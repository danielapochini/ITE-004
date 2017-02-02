package exercicio01;

public class Main {
	public static void main(String[] args){
		Peru pe = new Peru();
		Pato p = new PatoAdapter(pe);
		p.voar();
		p.grasnar();
	}
}
