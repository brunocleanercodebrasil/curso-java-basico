package cursojava.exercicios_2;

import java.util.Scanner;

public class QualTurnoEstuda {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno você estuda? (Digite m t ou n)");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")){
			System.out.println("Bom dia!");
		}else if (turno.equalsIgnoreCase("t")){
			System.out.println("Boa tarde!");
		}else if (turno.equalsIgnoreCase("n")){
			System.out.println("Bom noite!");
		}else {
			System.out.println("Turno inválido.");
		}
		
		
		
	}

}
