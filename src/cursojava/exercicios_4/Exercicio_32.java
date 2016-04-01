package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_32 {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o  " + (i+1) + "º número.");
			vetorA[i] = scan.nextInt();
			
		}
		
		for (int i=0; i<vetorA.length; i++){
			System.out.print("Tabuada de " + vetorA[i]);
			
			for (int j=0; j <= 10; j++){
				System.out.println( j + " * " + vetorA[i] + " = " + j*vetorA[i] );
			}
			
			System.out.println();
			
		}
		
		

	}

}
