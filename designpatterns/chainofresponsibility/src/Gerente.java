
public class Gerente extends Cargo {

	@Override
	public void AprovarVerba(Verba v) {
		if (v.getValor() <= 25000){
			msgAprovado();
		}else{
			suc.AprovarVerba(v);
		}
	}
}
