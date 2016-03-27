package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) + "ª posição");
			vetorA[i] = scan.nextInt();
		}
		
		int impar = 0;
		for (int i=0; i<vetorA.length; i++){
			if (vetorA[i] % 2 != 0){
				impar++;
			}
		}
		
		int par = vetorA.length - impar;
		
		double porcPar = (par * 100) / vetorA.length;
		double porcImpar = 100 - porcPar;
		
		System.out.print("\nVetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("\nPorcentagem de pares: " + porcPar);
		System.out.print("\nPorcentagem de pares: " + porcImpar);

	}

}
