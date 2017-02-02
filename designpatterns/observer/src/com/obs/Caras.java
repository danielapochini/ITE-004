package com.obs;

//CONCRETE SUBJECT
public class Caras extends Revista {
	private String noticia;
	
	@Override
	public String getState() {
		return noticia;
	}

	public void setNoticia(String noticia){
		this.noticia = noticia;
		notificar();
	}
}
