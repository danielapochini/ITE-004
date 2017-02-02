package com.obs;

public class Main {

	public static void main(String[] args) {
		Web web = new Web(); 
		Celular celular = new Celular();
		
		Caras caras = new Caras();
		caras.attach(web);
		caras.attach(celular);
		
		caras.setNoticia("Noticia Um"); 
		caras.setNoticia("Noticia Dois");
	}
}
