package cursojava.exercicios_5;

import java.util.Random;

public class Exercicio_01 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[4][4];

		Random randon = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = randon.nextInt(100);
			}

		}

		int maior = 0;
		// int menor = Integer.MAX_VALUE;
		int lin = 0;
		int col = 0;

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][j] > maior) {

					maior = numerosAleatorios[i][j];
					lin = i;
					col = j;

				}
			}
		}

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + (lin + 1));//para que seja contado a primeira linha como 1
		System.out.println("Coluna = " + (col + 1));//para que seja contado a primeira coluna como 1

	}

}
