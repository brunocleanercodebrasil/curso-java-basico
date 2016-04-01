package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];//par
		int[] vetorC = new int[vetorA.length];//impar
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) + "ª posição.");
			vetorA[i] = scan.nextInt();
			
		}
			
		int posB = 0;
		int posC = 0;
		
		for (int i=0; i<vetorA.length; i++){
			if(vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
			
		}
		
		System.out.print("\nVetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("\nVetor B = ");
		for (int i=0; i<posB; i++){
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.print("\nVetor C = ");
		for (int i=0; i<posC; i++){
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
