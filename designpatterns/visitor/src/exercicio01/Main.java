package exercicio01;

public class Main {

	public static void main(String[] args) {
		A a = new B(); //S� ESTA FAZENDO POLIFORFISMO AQUI! o ato de um objeto ser referido de varias formas
		D d = new D();
		B b = new B();
		C c = new C();
		
		//SOBRECARGA � VISTA EM TEMPO DE COMPILA��O
		d.foo(c);// d possui o metodo foo e possui c
		d.foo(b);// d possui o metodo foo e possui b
		//d.foo(a); = se colocar o "a" dentro do metodo "foo", vai dar erro, por que na hora 
		//que compila o java n�o sabe que aquele "a" na verdade � um B com uma referencia
		//diferente (linha 5)
		
		
		//SOBREESCRITA � VISTO EM TEMPO DE EXECU��O 
		a.metodo();//vai mostrar B
		b.metodo();//vai mostrar B
		c.metodo();//vai mostrar C
		
		//ELE S� SABE QUAL METODO CHAMAR POR CAUSA DO QUE ESTA ANTES DO PONTO
		a.bar(c); //bar em B recebe C
		
		//o que aconte quando executa isso -> a.bar(a)
		//a) bar a recebe a 
		//b)bar b recebe b
		//c) erro em tempo de execu��o X <- a certa
		//d)erro em tempo de compila��o
		
		
		//CACHE DA MESMA CLASSE RODA      
		//a.bar((B)a)
		//CACHE DE CLASSES DIFERENTES N�O RODA
		//a.bar((C)a)
	}
}
