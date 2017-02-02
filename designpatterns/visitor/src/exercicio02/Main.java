package exercicio02;

public class Main {

	public static void main(String[] args) {
		Cachorro cao = new Cachorro("Brian");
		Gato gato = new Gato ("Kevin");
		ChecarVisitor zooA = new ChecarVisitorZooA();
		ChecarVisitor zooB = new ChecarVisitorZooB();
		ObjectStructure o = new ObjectStructure();

		Animal animal = new Cachorro("Bidu");

		o.adicionar(cao);
		o.adicionar(gato);
		o.adicionar(animal);
		o.acceptAll(zooA);
		o.acceptAll(zooB); 

	}

	//SINGLE DISPATCH: EM JAVA , O DISPACHO DINAMICO DE UM METODO
	//EH FEITO SOH PELO TIPO DE THIS. EM UMA LINGUAGEM MULTIPLE DISPATCH
	//O DISPACHO DINAMICO SERIA FEITO PELO TIPO DO THIS E PELO TIPO DO SEUS PARAMETROS.
}
