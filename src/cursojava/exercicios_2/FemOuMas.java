package cursojava.exercicios_2;

import java.util.Scanner;

public class FemOuMas {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o sexo? (M - Masculino ou F - Feminino)");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("M") ){
			System.out.println("Sexo masculino.");
		}else if (sexo.equalsIgnoreCase("F") ){
			System.out.println("Sexo feminino.");
		}else{
			System.out.println("Sexo inválido.");
		}
		

	}

}