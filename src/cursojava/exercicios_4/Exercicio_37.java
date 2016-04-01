package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) + "ª posição");
			vetorA[i] = scan.nextInt();
			
			}
		
		int fatorial;
		
		for (int i=0; i<vetorA.length; i++){
			
		//	System.out.print(vetorA[i] + "! = "); Escondendo o output
			fatorial = 1;
			for (int j = vetorA[i]; j > 0; j--){
				fatorial *= j;
			//	System.out.print(j + " "); Escondendo o output
			}

			//System.out.println("Resultado: " + fatorial); Escondendo o output
			
			vetorB[i] = fatorial;
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
