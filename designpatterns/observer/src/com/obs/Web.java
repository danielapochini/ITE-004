package com.obs;

//CONCRETE OBSERVER 

public class Web implements Assinante {

	@Override
	public void update(Revista r) {
		System.out.println("Atualiza��o na p�gina web");
		System.out.println(r.getState());

	}

}
