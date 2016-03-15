package cursojava.exercicios_3;

import java.util.Scanner;

public class LojaTabajara {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean fechado = false;
		
		do{
		
		
		boolean vZero = false;
		int quant = 1;
		double preco;
		double total = 0;
		double pagamento = 0;
		
		do{
			System.out.println("Produto " + quant);
			preco = scan.nextDouble();
			
			if (preco > 0){
				
				
				total += preco;
				
				System.out.println("Número de produtos: " + quant + " produtos.");
				System.out.println("Valor total: R$ " + total);
				
				quant++;
				
			}else {
				
				quant -= 1;
				vZero = true;
			} 
			
		}while(!vZero);
		
		System.out.println("Número de produtos: " + quant + " produtos.");
		System.out.println("Valor total: R$ " + total);
		
		boolean suficiente = false;
		
		do{
		System.out.println("Entre com o valor a pagar. R$ ");
		pagamento = scan.nextDouble();
		
			if (pagamento >= total){
					suficiente = true;	
			}else{
				System.out.println("O valor de " + pagamento + " é menor que o valor total da compra.\nPor favor digite de novo.");
			}
		}while(!suficiente);	
		
		double troco = pagamento - total;
		
		System.out.println("Valor pago: R$ " + pagamento);
		System.out.println("Troco: R$ " + troco + "\n\nObrigado e volte semopre!");
		
		
		System.out.println("Caixa aberto? s / n ");
		String proximo = scan.next();
		
		if (proximo.equalsIgnoreCase("n")){
			fechado = true;
		}
		
		}while(!fechado);
		
		System.out.println("Até amanhã!");
			
		

	}

}
