package cursojava.exercicios_3;

import java.util.Scanner;

public class PaoDeOntem {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double precoUn = 0.18;
		
		System.out.println("Entre com o pre�o do p�o");
		precoUn = scan.nextDouble();
		
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		for (int i = 1; i <= 50; i++){
			
			System.out.println(i + " - R$ " + (i * precoUn) );
		}
	}
}
