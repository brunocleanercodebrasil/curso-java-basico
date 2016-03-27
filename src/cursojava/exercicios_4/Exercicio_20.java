package cursojava.exercicios_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		System.out.println("Entre com a cotação do dolar");
		cotacao = scan.nextDouble();
		
		for (int i=0; i<vetorA.length; i++){
			vetorA[i] = cotacao * (i+1);
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.println("R$ " + format.format(vetorA[i]) + " ");
		}
		System.out.println();

	}

}
