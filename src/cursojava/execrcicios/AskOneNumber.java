package cursojava.execrcicios;

import java.util.Scanner;

public class AskOneNumber {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		
		
		System.out.println("O número dogitado foi "+ num );
	}

}
