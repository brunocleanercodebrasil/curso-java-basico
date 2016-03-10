package cursojava.exercicios_3;

import java.util.Scanner;

public class Fibonacci1 {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n-ésimo termo da série de Fibonacci.");
		int n = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int prox = 0;
		
		System.out.print(primeiro + " ");
		System.out.print(segundo + " ");
		
		for (int i = 3; i <= n; i++){
			prox = primeiro + segundo;
			primeiro = segundo;
			segundo = prox;
			
			System.out.print(prox + " ");
		}
		
		

	}

}
