package cursojava.exercicios_3;

import java.util.Scanner;

public class Fatorial2 {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número.");
		int num = scan.nextInt();
		
		System.out.println("O fatorial de " + num);
		
		System.out.print(num + "! = ");
		
		int fatorial = 1;
		
		for (int i = num; i > 1; i--){
			fatorial *= i;
			System.out.print(i + " . ");
		}

		System.out.print("1 = " + fatorial);
	}

}
