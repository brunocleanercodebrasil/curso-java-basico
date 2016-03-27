package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int soma = 0;
		int impar = 0;
		
		for (int i=0; i<numeros.length; i++){
			System.out.println("Digite o " + (i+1) + "º número");
			numeros[i] = scan.nextInt();
			
			if (numeros[i] % 2 != 0){
				soma += numeros[i];
				impar++;
			}
		}
		
		System.out.print("Número digitados: ");
		for(int i=0; i<numeros.length; i++){
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("\nSoma dos impares: " + soma);
		System.out.println("Média: " + soma / impar);
	}

}
