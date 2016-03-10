package cursojava.execrcicios;

import java.util.Scanner;

public class CalculaArea {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado");
		double lado = scan.nextDouble();
		
		//area = lado * lado;
		double area = Math.pow(lado, 2);
		System.out.println("A área do quadrado é igual a " + area);
		
		System.out.println("O dobro da área do quadrado é igual a " + (area * 2 ));
		
	}

}
