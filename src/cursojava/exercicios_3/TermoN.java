package cursojava.exercicios_3;

import java.util.Scanner;

public class TermoN {

	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de n");
		int n = scan.nextInt();
		int i, j;
		double soma = 0;
		for (i = 1, j = 1; i < n; i++, j += 2){
			
			System.out.print(i + "/" + j + " + ");
			soma += i/j;
		}
		System.out.println(n + "/" + j);
		System.out.println("Soma = " + soma);

	}

}
