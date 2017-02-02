package exercicio02;

public class Main {

	public static void main(String[] args) {
		Calculos c = new Calculos();
		Operacoes o = (x,y)->{
			return x/y;
		};
		
		c.setO(o);
		
		System.out.println(c.calculos(2,4));
	}

}
