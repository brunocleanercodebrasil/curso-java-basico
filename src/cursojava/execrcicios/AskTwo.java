package cursojava.execrcicios;

import java.util.Scanner;

public class AskTwo {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Olá! Digite um numero.");
		int numUm = scan.nextInt();
		
		System.out.println("Agora Digite outro numero.");
		int numDois = scan.nextInt();
		
		int soma = numUm + numDois;
		
		System.out.println("A soma de " + numUm + " + " + numDois + " é " + soma);		
		
	}

}
