package cursojava.execrcicios;

import java.util.Scanner;

public class MostrarArea {

	
	public static void main(String[] args) {
		
		double PI = 3.14;
		double circunferencia;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite o valor do raio");
		
		double raio = scan.nextDouble();
		
		circunferencia = PI * (raio * raio);
		
		System.out.println("A área do circulo é " + circunferencia );

	}

}
