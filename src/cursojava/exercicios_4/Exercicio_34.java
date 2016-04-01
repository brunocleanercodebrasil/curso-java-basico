package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o  " + (i+1) + "º número.");
			vetorA[i] = scan.nextInt();
		}
		
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Analizando o número " + vetorA[i]);
			
			for (int j=2; j<vetorA[i]; j++){
				if (j % 2 == 0){
					System.out.println(j + " é par.");
				}
			}
			
			System.out.println();
		}
		
	}

}
