package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int soma = 0;
		
		for (int i=0; i<numeros.length; i++){
			System.out.println("Digite o " + (i+1) + "� n�mero");
			numeros[i] = scan.nextInt();
			
			if (numeros[i] % 5 == 0){
				soma += numeros[i];
			}
		}
		
		System.out.print("N�mero digitados: ");
		for(int i=0; i<numeros.length; i++){
			System.out.print(numeros[i] + " ");
		}
		
		System.out.print("\nSoma dos n�meros multiplos de cinco: " + soma);
	}

}
