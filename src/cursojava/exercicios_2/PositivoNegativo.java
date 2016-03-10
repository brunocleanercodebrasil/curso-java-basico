package cursojava.exercicios_2;

import java.util.Scanner;

public class PositivoNegativo {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double num = scan.nextDouble();
		
		if ( num > 0){
			System.out.println("O número " + " é positivo.");
		}else if (num < 0){
			System.out.println("O número " + "é negativo.");
		}else{
			System.out.println("O número " + "é nulo.");
		}

	}

}
