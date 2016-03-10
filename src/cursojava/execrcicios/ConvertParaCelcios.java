package cursojava.execrcicios;

import java.util.Scanner;

public class ConvertParaCelcios {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit ");
		double tempFarenheit = scan.nextDouble();
		double tempCelcios = (5 * (tempFarenheit -32) / 9);
		
		System.out.println("A temperatura " + tempFarenheit + "F é igual a " + tempCelcios +"C.");

	}

}