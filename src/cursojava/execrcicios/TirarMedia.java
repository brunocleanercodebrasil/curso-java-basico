package cursojava.execrcicios;

import java.util.Scanner;

public class TirarMedia {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double media;		
		System.out.println("Digite a primeira nota" );
		double nt1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota" );
		double nt2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota" );
		double nt3 = scan.nextDouble();
		
		System.out.println("Digite a quarta nota" );
		double nt4 = scan.nextDouble();
		
		media = (nt1 + nt2 + nt3 + nt4) / 4;
		System.out.println("Média das notas:" + media );

	}

}
