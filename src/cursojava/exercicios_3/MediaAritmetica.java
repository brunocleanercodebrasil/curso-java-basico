package cursojava.exercicios_3;

import java.util.Scanner;

public class MediaAritmetica {

	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de notas.");
		int notas = scan.nextInt();
		
		double soma = 0;
		double media = 0;
		double nota = 0;
		
		for(int x = 1; x <= notas; x++){
			System.out.println("Entre com a " + x + "ª nota.");
			nota = scan.nextDouble();
			
			soma += nota;
		}
		
		media = soma / notas;
		
		System.out.println("Soma = " + soma);
		System.out.println("Média = " + media);
	}

}
