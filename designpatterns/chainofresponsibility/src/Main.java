import java.util.Scanner;

// desafio - conectar com um formulario jsf como foi conectado com o scanner, na linha 11
//arrumar o metodo pra mostrar o componente direito
//msg de aprovado na mesma pagina 0,5 ponto

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a verba: ");
		Verba v = new Verba(sc.nextDouble());
		Analista a = new Analista();
		Gerente g = new Gerente();
		Diretor d = new Diretor();
		CEO c = new CEO();
		
		a.setSuc(g);
		g.setSuc(d);
		d.setSuc(c);
		
		a.AprovarVerba(v);

		sc.close();
	}
}
