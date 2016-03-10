package cursojava.exercicios_2;

import java.util.Scanner;

public class FolhaTabajara {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do salário atual. R$ ");
		double salario = scan.nextDouble();
		double percentual = 0;
		
		if (salario <= 280){
			percentual = 20;
		}else if (salario >280 && salario <700){
			percentual = 15;
		}else if (salario  >= 700 && salario < 1500){
			percentual = 10;
		}else {
			percentual = 5;
		}
		
		double aumento = ( salario / 100 ) * percentual;
		double novoSalario = salario + aumento;
		
		System.out.println("Salário antes do reajuste: R$ " + salario);
		System.out.println("Percentual de aumento: R$ " + percentual);
		System.out.println("Valor do aumento: R$ " + aumento);
		System.out.println("Salário reajustado: R$ " + novoSalario);
	}

}
