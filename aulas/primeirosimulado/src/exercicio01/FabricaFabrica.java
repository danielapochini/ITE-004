package exercicio01;

public enum FabricaFabrica {
	
	NIKE{
		@Override
		public Bola fabricarBola() {
			FabricaNike fn = new FabricaNike();
			return  fn.criarBola("Bolas Futebol Americano", Cor.MARROM, "Costura"); 
		} 
	},
	
	PUMA{

		@Override
		public Bola fabricarBola() {
			FabricaPuma fp = new FabricaPuma();
			return fp.criarBola("Futebol Society", Cor.NEON, "Latex");
		}
		
	},
	ADIDAS{

		@Override
		public Bola fabricarBola() {
			FabricaAdidas fa = new FabricaAdidas();
			return fa.criarBola("Futebol Tradicional", Cor.BRANCO, "Poliestireno");
		}
		
	};
	
	abstract public Bola fabricarBola();
}
