package com.obs;

//CONCRETE OBSERVER 

public class Celular implements Assinante {

	@Override
	public void update(Revista r) {
		System.out.println("Atualiza��o no celular");
		System.out.println(r.getState());

	}

}
