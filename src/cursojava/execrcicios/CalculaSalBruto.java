package cursojava.execrcicios;

import java.util.Scanner;

public class CalculaSalBruto {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		double horTrab = scan.nextDouble();
		
		double salario = ganhoHora * horTrab;
		
		System.out.println("Seu salário é de " + salario);
		
		
	}

}
