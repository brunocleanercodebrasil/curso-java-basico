package cursojava.exercicios_5;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] numeros = new int[3][3];
		
		for (int i=0; i<numeros.length; i++){
			for(int j=0; j<numeros[i].length; j++){
				
				System.out.println("Entre com o valor da posi��o [" + i + "]");
				numeros[i][j] = scan.nextInt();
			}
		}
		
		int par = 0;
		int impar = 0;
		
		for (int i=0; i<numeros.length; i++){
			for(int j=0; j<numeros[i].length; j++){
				if(numeros[i][j] % 2 ==0){
					par ++;
				}else {
					impar ++;
				}
			}
		}
		
		
		
		//Sa�da
		System.out.println();
		System.out.println("N�meros digitados:");
		for (int i=0; i<numeros.length; i++){
			for(int j=0; j<numeros[i].length; j++){
				System.out.print(numeros[i][j] + " ");	
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros impares: " + impar);

	}
}
