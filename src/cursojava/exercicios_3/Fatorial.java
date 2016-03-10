package cursojava.exercicios_3;

import java.util.Scanner;

public class Fatorial {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número.");
		int num = scan.nextInt();
		
		System.out.print(num + "! = ");
		
		int fatorial = 1;
		
		for (int i = num; i > 0; i--){
			fatorial *= i;
			System.out.print(i + " ");
		}

		System.out.println("Resultado: " + fatorial);
	}

}
