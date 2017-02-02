package exercicio02;

public class Calculos {

	private Operacoes O;


	
	public void setO(Operacoes o) {
		O = o;
	}


	public double calculos(double x, double y){
		return O.calc(x,y);
	}
	
	//1. fazer o functional interface
	//2. ter como atributo o parametro a referencia para a functional interface (linha 3)
	//3. fazer o set (opcional)
	//4. fazer um metodo para chamar a operacao contida na referencia para a func interface
	//5. definir o lambda
}
