package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i=0; i<vetorA.length; i++){
			System.out.println("Entre com o  " + (i+1) + "� n�mero.");
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
				msg = " � um n�mero primo.";
			}else{
				msg = " n�o � um n�mero primo.";
			}
			
			System.out.println(vetorA[i] + msg);
		}
		
		
	}

}
