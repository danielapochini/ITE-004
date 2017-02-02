package exercicio04;
/*
Exercicio: Um Cliente possui nome, tipo de cart�o de credito e anuidade.
Cada tipo de cart�o possui um desconto de anuidade.
O cart�o normal possui 5%, o Silver 7%, o Gold 10%, Platinum 15% e Black 30%
O Cliente deve ter um m�todo de c�lculo de anuidade baseado em seu tipo de cart�o. */

public enum TipoCartao {
	NORMAL(5), SILVER(7), GOLD (10), PLATINUM (15), BLACK (30);
	
	private double anuidade;

	private TipoCartao(double anuidade) {
		this.anuidade = anuidade;
	}

	public double getAnuidade() {
		return anuidade;
	}
	
	
	/*NORMAL {
		@Override
		public double calculoAnuidade(){
			return 0.95;
		}
	},
	
	SILVER {
		@Override
		public double calculoAnuidade(){
			return
		}
	},
	
	GOLD {
		@Override
		public double calculoAnuidade(){
			return
		}
	},
	
	PLATINUM {
		@Override
		public double calculoAnuidade(){
			return
		}
	},
	
	BLACK{
		@Override
		public double calculoAnuidade(){
			return
		}
	};
	
	public double calculoAnuidade(){
	}*/
}
