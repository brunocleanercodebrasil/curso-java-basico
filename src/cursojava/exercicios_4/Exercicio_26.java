package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_26 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) + "ª posição.");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorB.length; i++){
			System.out.println("Entre com o valor da " + (i+1) + "ª posição.");
			vetorB[i] = scan.nextInt();
			
			if (vetorA[i] == vetorB[i]){
				vetorC[i] = 0;
			}else if (vetorA[i] > vetorB[i]){
				vetorC[i] = 1;
			}else {
				vetorC[i] = -1;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + "\t");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++){
			System.out.print(vetorB[i] + "\t");
		}
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		for (int i=0; i<vetorC.length; i++){
			System.out.print(vetorC[i] + "\t");
		}
	}

}
