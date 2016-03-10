package cursojava.execrcicios;

import java.util.Scanner;

public class MostrarAreaII {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite o valor do raio");
		
		double raio = scan.nextDouble();
		
		//area = PI * (raio * raio);
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do circulo é " + area );

	}

}
