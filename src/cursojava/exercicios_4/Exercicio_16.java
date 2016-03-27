package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int somaMenor15 = 0;
		int qtdIgual15 = 0;
		int qtdMaior15 = 0;
		int somaMaior15 = 0;
				
		/*
		 *  a) a soma de elementos armazenados neste
			vetor que são inferiores a 15; b) a quantidade de elementos
			armazenados no vetor que são iguais a 15; e c) a média dos
			elementos armazenados no vetor que são superiores a 15.
		 */
		
		for (int i=0; i<vetorA.length; i++){
			
			System.out.println("Entre com o valor da " + (i+1) + "ª posição");
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] < 15){
				somaMenor15 += vetorA[i];
			}
			if (vetorA[i] == 15){
				qtdIgual15++;
			}
			if (vetorA[i] > 15){
				somaMaior15 += vetorA[i];
				qtdMaior15++;
			}
		}
		
		System.out.print("Valores do vetor: ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		double media = somaMaior15 / qtdMaior15;
		System.out.println("\nSoma dos elementos menores que 15: " + somaMenor15);
		System.out.println("Quantidade de elementos iguais a 15: " + qtdIgual15);
		System.out.println("Media dos elementos maiores que 15: " + media);
	}

}
