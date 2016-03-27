package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre coom o valor da " + (i+1) + "ª posição");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i=0; i<vetorB.length; i++){
			System.out.println("Entre coom o valor da " + (i+1) + "ª posição");
			vetorB[i] = scan.nextInt();
			
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
		System.out.print("\nVetor A = ");
		for (int i =0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("\nVetor B = ");
		for (int i =0; i<vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.print("\nVetor C = ");
		for (int i =0; i<vetorC.length; i++){
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
