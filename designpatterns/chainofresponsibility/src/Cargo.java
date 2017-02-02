
public abstract class Cargo {
	
	protected Cargo suc;
	
	public void setSuc(Cargo suc) {
		this.suc = suc;
	}

	public abstract void AprovarVerba(Verba v);
	
	public void msgAprovado(){
		System.out.println("Aprovado por " + this.getClass().getSimpleName());
	}

}
