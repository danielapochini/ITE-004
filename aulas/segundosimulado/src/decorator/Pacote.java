package decorator;

abstract public class Pacote extends Viagem {
	protected Viagem viagem;
	
	public void setPacoteAdc(Viagem viagem) {
		this.viagem = viagem;
	}

}
