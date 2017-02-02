package exercicio03;

public enum Animal {

	DUCK {
		@Override
		public void emitirSom(){
			System.out.println("QUACK");
		}
	},
	

	CAT {
		@Override
		public void emitirSom(){
			System.out.println("PRRR");
		}
	},
	

	DOG {
		@Override
		public void emitirSom(){
			System.out.println("AUAU");
		}
	},
	

	PIG {
		@Override
		public void emitirSom(){
			System.out.println("OINC OINC");
		}
	};

	public void emitirSom() {
	}
}
