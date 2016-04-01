package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] VetorA = new int[10];
		int[] VetorB = new int[VetorA.length];
		
		for (int i=0; i<VetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) + "ª posição.");
			VetorA[i] = scan.nextInt();
			
		}
		
		for (int i=0; i<VetorA.length; i++){
			VetorB[i] = VetorA[VetorA.length - 1 - i];
		}
		
		System.out.println();
		System.out.print("VetorA = ");
		
		for (int i=0; i<VetorA.length; i++){
			System.out.print(VetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("VetorB = ");
		
		for (int i=0; i<VetorA.length; i++){
			System.out.print(VetorB[i] + " ");
		}
	}

}
