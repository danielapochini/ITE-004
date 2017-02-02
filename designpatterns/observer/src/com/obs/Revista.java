package com.obs;

import java.util.ArrayList;

//classe abstrata pq é o subject, tem um arraylist (vetor de Assinantes - polimorfismo)
//sempre que tiver um arraylist boa pratica instanciar ele no construtor, se não não funciona
//se no attach pega o parametro assinante pega o assinante e coloca dentro da lista de assinantes(vetor)
//detach - remover o assinante
//notificar() - fazer um for em todos os assinantes e com esse for voce dá update
//metodo abstrato para ver como pega o estado, vai depender do concretesubject, vai depender da revista
//se for revista de ciencia - estado - revista de ciencia

public abstract class Revista {
	private ArrayList <Assinante> fas;
	
	public Revista(){
		fas = new ArrayList<Assinante>();
	}
	
	//NOVO ASSINANTE
	public void attach(Assinante f){
		fas.add(f);
	}
	
	public void detach(Assinante f){
		fas.remove(f);
	}
	//NOTIFICA ATUALIZAÇÃO
	public void notificar(){
		for (Assinante f : fas){
			f.update(this); //this é ele proprio (a revista, pois está na classe Assinante)
		}		
	}
	
	//O OBSERVER DEVE LER A ATUALIZAÇÃO
	
	public abstract String getState();
}
