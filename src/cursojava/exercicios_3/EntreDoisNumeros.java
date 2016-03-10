package cursojava.exercicios_3;

import java.util.Scanner;


public class EntreDoisNumeros {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numA;
		int numB;
		
		System.out.println("Entre com o primeiro Número.");
		numA = scan.nextInt();
		
		System.out.println("Entre com o segundoo Número.");
		numB = scan.nextInt(); 
		
		if ( numA > numB ){
			for(int x = numA - 1; x > numB; x--){
				System.out.print(x + " ");
			}
		}else if( numB > numA ){
				for(int x = numA + 1; x < numB; x++){
					System.out.print(x + " ");
			}
		}else {
			System.out.println("Os números são iguais. Não há intervalo inteiro entre eles." );
		}

	}

}
