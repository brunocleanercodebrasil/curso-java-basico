package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_24 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o número da " + (i+1) + "ª posição");
			vetorA[i] = scan.nextInt();
			
		}
		boolean palindromo = true;
		for (int i=0; i<vetorA.length / 2; i++){
			
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]){
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		if (palindromo){
			System.out.println("Palindromo.");
		}else {
			System.out.println("Não é Palindromo.");
		}
	}

}
