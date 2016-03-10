package cursojava.exercicios_2;

import java.util.Scanner;

public class QualMaior {

	
	public static void main(String[] args) {
	
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o segundo número ");
		int n2 = scan.nextInt();
		
		if (n1 > n2){
			System.out.println("Maior número: " + n1);
		}else{
		System.out.println("Maior número: " + n2);
		}

	}

}
