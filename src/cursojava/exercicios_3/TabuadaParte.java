package cursojava.exercicios_3;

import java.util.Scanner;

public class TabuadaParte {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de ");
		int num = scan.nextInt();
		boolean invalido = true;
		int comeco;
		int fim;
		
		do{
			System.out.print("Começar por ");
			comeco = scan.nextInt();
			
			System.out.print("Terminar em ");
			fim = scan.nextInt();
			
			if (fim > comeco){
				invalido = false;
			}
			
		}while(invalido);
		
		
		System.out.println("\nTabuada de " + num + ":");
		System.out.println("Começar por " + comeco);
		System.out.println("Terminar em " + fim);
		System.out.println();
		for (int i = comeco; i <= fim; i++){
			System.out.println(num + " x " + i + " = " + ( num * i ) );
			
		}
	}

}
