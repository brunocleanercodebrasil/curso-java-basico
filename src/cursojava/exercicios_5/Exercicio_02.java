package cursojava.exercicios_5;

import java.util.Random;

public class Exercicio_02 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[10][10];

		Random randon = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = randon.nextInt(100);
			}

		}
		
		
		//Analisando a Linha
		int numLinha = 4;
		int maiorLin = Integer.MIN_VALUE;
		int menorLin = Integer.MAX_VALUE;

		for (int i = 0; i < numerosAleatorios[numLinha].length; i++) {

			if (numerosAleatorios[numLinha][i] > maiorLin) {

				maiorLin = numerosAleatorios[numLinha][i];
			}

			if (numerosAleatorios[numLinha][i] < menorLin) {

				menorLin = numerosAleatorios[numLinha][i];
			}

		}
		//Analisando a Coluna
		int numColuna = 6;
		int maiorColuna = Integer.MIN_VALUE;
		int menorColuna = Integer.MAX_VALUE;
		
		for (int i=0; i< numerosAleatorios.length; i++){
			
			if (numerosAleatorios[i][numColuna] > maiorColuna) {

				maiorColuna = numerosAleatorios[i][numColuna];
			}

			if (numerosAleatorios[i][numColuna] < menorColuna) {

				menorColuna = numerosAleatorios[i][numColuna];
			}
			
		}
		
		
		
		
		
		
		//Saída
		System.out.println("Numeros Gerados: ");
		System.out.println();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Maior número da linha " + (numLinha+1) + " = " + maiorLin);
		System.out.println("Menor número da linha " + (numLinha+1) + " = " + menorLin );
		
		System.out.println();
		
		System.out.println("Maior número da coluna " + (numColuna+1) + " = " + maiorColuna);
		System.out.println("Menor número da coluna " + (numColuna+1) + " = " + menorColuna );
		
	}

}
