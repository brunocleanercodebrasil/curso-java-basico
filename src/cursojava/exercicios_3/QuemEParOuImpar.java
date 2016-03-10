package cursojava.exercicios_3;

import java.util.Scanner;

public class QuemEParOuImpar {

	
	
	public static void main(String[] args) {
		
		Scanner sccan = new Scanner(System.in);
		
		int num;
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i<10; i++){
			System.out.println("Entre co um número.");
			num = sccan.nextInt();
			
			if (num % 2 == 0){
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.println("Pares: " + pares);
		System.out.println("Imares: " + impares);
	}

}
