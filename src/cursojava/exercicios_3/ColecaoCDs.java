package cursojava.exercicios_3;

import java.util.Scanner;

public class ColecaoCDs {

	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		double preco = 0;
		double total = 0;
		
		System.out.println("Entre com o número de cds.");
		int cds = scan.nextInt();
		
		for (int i = 1; i <= cds; i++){
			System.out.println("Entre com o preço do cd " + i);
			preco = scan.nextDouble();
			
			total += preco;
			
		}
		
		double media = total / cds;
		System.out.println("Valor total da coleção: R$ " + total);
		System.out.println("Valor médio para cada cd: R$ " + media);

	}
	
}
