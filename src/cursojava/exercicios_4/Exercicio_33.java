package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o  " + (i+1) + "º número.");
			vetorA[i] = scan.nextInt();
			
		}
		
		boolean primo;
		String msg = "";
		
		System.out.println("Vetor A:");
		for (int i=0; i<vetorA.length; i++){
			primo = true;
			for (int j=2; j<vetorA[i]; j++){
				if(vetorA[i] % j == 0){
					primo = false;
					break;
				}
			}
			
			if (primo){
				msg = " é um número primo.";
			}else{
				msg = " não é um número primo.";
			}
			
			System.out.println(vetorA[i] + msg);
		}
		
		
	}

}
