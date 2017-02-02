package com.obs;

//CONCRETE OBSERVER 

public class Web implements Assinante {

	@Override
	public void update(Revista r) {
		System.out.println("Atualização na página web");
		System.out.println(r.getState());

	}

}
