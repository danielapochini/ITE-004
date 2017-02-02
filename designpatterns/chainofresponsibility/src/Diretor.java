
public class Diretor extends Cargo {

	@Override
	public void AprovarVerba(Verba v) {
		if (v.getValor() <= 50000){
			msgAprovado();
		}else{
			suc.AprovarVerba(v);
		}
	}
}

