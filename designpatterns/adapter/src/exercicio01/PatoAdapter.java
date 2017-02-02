package exercicio01;

public class PatoAdapter implements Pato{
	private Peru p;
	
	public PatoAdapter(Peru p){
		this.p = p;
	}
	
	public void grasnar() {
		p.wooble();
	}

	@Override
	public void voar() {
		p.baterAsas();
	}

}
