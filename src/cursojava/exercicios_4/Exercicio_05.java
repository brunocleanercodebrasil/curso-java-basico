package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) + "� posi��o");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.print("\nVetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("\nVetor B = ");
		for (int i=0; i<vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}
		
	}

}
