package exercicio;

public enum FabricaFabrica {
	SEDAN {
		@Override
		public Carro fabricarCarro() {
			FabricaSedan fs = new FabricaSedan();
			//O NOME DO CARRO E SUA LOCALIDADE
			//SAO ORIUNDOS DE UM BANCO DE DADOS
			return fs.criarCarro("Carro Sedan", Local.ASIA);
		}
	}, LUXO {
		@Override
		public Carro fabricarCarro() {
			FabricaLuxo fl = new FabricaLuxo();
			return fl.criarCarro("Carro Luxo", Local.EUROPA);
		}
	}, POPULAR {
		@Override
		public Carro fabricarCarro() {
			FabricaPopular fp = new FabricaPopular();
			return fp.criarCarro("Carro Popular", Local.USA);
		}
	};
	
	abstract public Carro fabricarCarro();
}
