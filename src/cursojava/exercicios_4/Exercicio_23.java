package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) +"ª posição ");
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 != 0){
				break;
			}
		}
		
		System.out.print("\nVetor A = ");
		
	}

}
