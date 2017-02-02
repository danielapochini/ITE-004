package visitor;

public class DoisArgs extends NumeroElement {
	
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}


	public DoisArgs(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	@Override
	public void accept(OpenVisitor o) {
		o.somar(this);

	}

}
