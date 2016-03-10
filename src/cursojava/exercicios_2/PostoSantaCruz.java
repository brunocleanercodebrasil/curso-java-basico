package cursojava.exercicios_2;

import java.util.Scanner;

public class PostoSantaCruz {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros vendidos.");
		double litros = scan.nextDouble();
		
		System.out.println("Entre com o tipo de combustível.");
		String opcaoLetra = scan.next();
		
		double precoTabelaGasolina = 2.50;
		double precoTabelaAlcool = 1.90;
		double desc = 0;
		double total = 0;
		double totalDesconto = 0;
		
		if (opcaoLetra.equalsIgnoreCase("a")){
			if(litros <= 20){
				desc = 3;
			}else {
				desc = 5;
			}
			total = litros * precoTabelaAlcool;
			
		}else if (opcaoLetra.equalsIgnoreCase("g")){
			if(litros <= 20){
				desc = 4;
			}else {
				desc = 6;
			}
			total = litros * precoTabelaGasolina;
		}
		
		totalDesconto = (total / 100)* desc;
		
		double precoCobrado = total - totalDesconto;
		
		System.out.println("Valor a pagar: " + precoCobrado);
		
	}	
}