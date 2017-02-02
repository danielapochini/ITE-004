package visitor;

public class TresArgs extends NumeroElement {
	
	private int a;
	private int b;
	private int c;
	
	
	public int getA() {
		return a;
	}


	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public TresArgs(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}


	@Override
	public void accept(OpenVisitor o) {
		o.somar(this);
	}

}
