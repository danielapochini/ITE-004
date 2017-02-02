package exercicio02;

public class EquacaoSegundo {
	
	//a=1
	private double delta(double b, double c){
		return b*b - 4*c;
	}
	
	public double raiz1(double b, double c) throws Exception{
		double d = delta(b,c);
		if(d >= 0){
			return (-b + Math.sqrt(d))/2;
		}else{
			throw new Exception("Delta negativo");
		}
	}
	
}
