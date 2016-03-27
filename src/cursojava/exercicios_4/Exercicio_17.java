package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int qtdMaiores = 0;
		int target = 35;
		
		for (int i=0; i<idades.length; i++){
			
			System.out.println("Entre com a  " + (i+1) + "ª idade");
			idades[i] = scan.nextInt();
			
			if (idades[i] > target){
				qtdMaiores++;
			}
		}
		
		System.out.println("Idades apuradas: ");
		for (int i=0; i<idades.length; i++){
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		System.out.print("Quantidade de pessoas maiores que " + target + " anos: " + qtdMaiores);

	}

}
