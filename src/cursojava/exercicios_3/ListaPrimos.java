package cursojava.exercicios_3;

import java.util.Scanner;

public class ListaPrimos {

	
		
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número ");
		int num = scan.nextInt();
		boolean primo = true;
		
		for (int i = 1; i <= num; i++){
			
			primo = true;
			
			for (int j = 2; j < i; j++){
				if (i % j == 0){
					
					primo = false;
					//break;
				}	
			}
			
			if (primo){
				System.out.println(i);
			}
		}
		
		

	}

}
