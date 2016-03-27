package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) +"ª posição ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("\nVetor A = ");
		
		do{
			int j=0;
			System.out.print(vetorA[j] + " ");
			j++;
		}while((vetorA[j] % 2 != 0));
		
	}

}
