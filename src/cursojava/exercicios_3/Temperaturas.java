package cursojava.exercicios_3;

import java.util.Scanner;

public class Temperaturas {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de temperaturas. ");
		int qtdTemperaturas = scan.nextInt();
		
		double temp;
		double somaTemp = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for(int i = 1; i <= qtdTemperaturas; i++){
			System.out.println("Entre com a " + i +"ª temperatura " );
			temp = scan.nextDouble();
			
			somaTemp += temp;
			
			if (temp > maior){
				maior = temp;
			}
			
			if (temp < menor){
				menor = temp;
			}
		}
		
		System.out.println("Menor temperatura: " + menor + " graus.");
		System.out.println("Maior temperatura: " + maior + " graus.");
		System.out.println("Média: " + (somaTemp / qtdTemperaturas) + " graus.");

	}

}
