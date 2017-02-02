
public class Analista extends Cargo {

	@Override
	public void AprovarVerba(Verba v) {
		if (v.getValor() <= 10000){
			msgAprovado();
		}else{
			suc.AprovarVerba(v);
		}
		
	}

}
