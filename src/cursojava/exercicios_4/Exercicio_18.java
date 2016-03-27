package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int menorIdade = Integer.MAX_VALUE;
		int maiorIdade = Integer.MIN_VALUE;
		int posMenor = 0;
		int posMaior = 0;
		
		for (int i=0; i<idades.length; i++){
			
			System.out.println("Entre com a  " + (i+1) + "ª idade");
			idades[i] = scan.nextInt();
			
			if (idades[i] < menorIdade){
				menorIdade = idades[i];
				posMenor = i;
			}
			if (idades[i] > maiorIdade){
				maiorIdade = idades[i];
				posMaior = i;
			}
		}
		
		System.out.print("Idades apuradas: ");
		for (int i=0; i<idades.length; i++){
			System.out.print(idades[i] + " ");
		}
		
		System.out.println();
		System.out.print("Menor idade: " + menorIdade + " anos." + "\t" + (posMenor + 1) + "ª idade apurada.");
		System.out.println();
		System.out.print("Maior idade: " + maiorIdade + " anos." + "\t" + (posMaior + 1) + "ª idade apurada.");

	}

}
