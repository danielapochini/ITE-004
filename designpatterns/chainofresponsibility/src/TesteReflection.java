
public class TesteReflection {

	public static void main(String[] args) {
		Verba v = new Verba(5000);
		Class<? extends Verba> c = v.getClass(); 
		//Reflection - a partir do metadado consegue ver o nome da classe
		System.out.println(c.getSimpleName());

	}

}
