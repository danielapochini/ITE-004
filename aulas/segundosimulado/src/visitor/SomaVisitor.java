package visitor;

public class SomaVisitor extends OpenVisitor {

	@Override
	public void somar(DoisArgs d) {
		System.out.println("Soma de Dois numeros: " + (d.getA() + d.getB()));
		
	}

	@Override
	public void somar(TresArgs t) {
		System.out.println("Soma de Tres numeros: " + (t.getA() + t.getB() + t.getC()));
	}

}
