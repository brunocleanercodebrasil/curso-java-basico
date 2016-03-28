package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_25 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) + "ª posição.");
			vetorA[i] = scan.nextInt();
			
			/*if (vetorA[i] % 2 == 0){
				vetorB[i] = 1;
			}else{
				vetorB[i] = 0;
			}*/
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0; // OPERADOR TERNÁRIO :)
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

	}

}
