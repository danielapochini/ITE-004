package visitor;

public class Main {
	public static void main(String[] args) {
		DoisArgs d = new DoisArgs(5, 2);
		TresArgs t = new TresArgs(2,3,4);
		OpenVisitor o = new SomaVisitor();
		
		d.accept(o);
		t.accept(o);
	}
	
}
