package cursojava.exercicios_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da " + (i+1) + "ª posição");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("\nvetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("\nvetor B = ");
		for (int i=0; i<vetorB.length; i++){
			System.out.print(df.format(vetorB[i]) + " ");
		}
		
	}
	
}