package cursojava.exercicios_2;

import java.util.Scanner;

public class AnoBisexto {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano.");
		int ano = scan.nextInt();
			
		if ( ( ano % 400 == 0 ) || ( ano % 4 == 0 && ano % 100 != 0) ){
			System.out.println("Esse ano é bisexto.");
		} else {
			System.out.println("Esse ano não é bisexto");
		}

	}

}

/*if (ano % 4 == 0){
System.out.println("Esse ano é bisexto.");
} else {
System.out.println("Esse ano não é bisexto");
}*/
