package cursojava.exercicios_2;

import java.util.Scanner;

public class Fruteira {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade em Kg de morango");
		double pesoMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade em Kg de maçã");
		double pesoMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if (pesoMorango <= 5){
			precoKgMorango = 2.50;
		}else {
			precoKgMorango = 2.20;
		}
		
		double precoKgMaca = 0;
		if (pesoMaca <= 5){
			precoKgMaca = 1.80;
		}else {
			precoKgMaca = 1.50;
		}
		
		double precoAtualMaca = pesoMaca * precoKgMaca;
		double precoAtualMorango = pesoMorango * precoKgMorango;
		
		double precoparcial = precoAtualMaca + precoAtualMorango;
		double pesoTotal = pesoMaca + pesoMorango;
		double desconto = 0;
		
		
		if ( pesoTotal > 8 || precoparcial > 25 ){
			desconto = 10;
		}else {
			desconto = 0;
		}
		double valorDesconto = ( precoparcial / 100 ) * desconto;
		double precoCobrado = precoparcial - valorDesconto; 
		
		System.out.println( "Valor total: " + precoCobrado );
		
	}

}
