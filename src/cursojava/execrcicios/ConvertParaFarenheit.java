package cursojava.execrcicios;

import java.util.Scanner;

public class ConvertParaFarenheit {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celcius ");
		double tempCelcius = scan.nextDouble();
		
		//°F = °C × 1,8 + 32
		double tempFarenheit = tempCelcius * 1.8 + 32;		
		System.out.println("A temperatura " + tempCelcius + "C é igual a " + tempFarenheit +"F.");

	}

}
