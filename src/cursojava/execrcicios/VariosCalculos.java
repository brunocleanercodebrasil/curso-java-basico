package cursojava.execrcicios;

import java.util.Scanner;

public class VariosCalculos {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite mais um número inteiro ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um número real ");
		double num3 = scan.nextDouble();
		
		int calc1 = (num1 * 2 ) * ( num2/2);
		System.out.println("O produto do dobro do primeiro com a metade do segundo: " + calc1 );
		
		int calc2 = num1 * 3 + (int) num3;
		System.out.println("A soma do triplo do primeiro com o terceiro: " + calc2 );
		
		double calc3 = Math.pow(num3, 3);
		System.out.println("O terceiro elevado ao cubo: " + calc3);
		
		}

}
