package cursojava.exercicios_2;

import java.util.Scanner;

public class InvestigaCrime {

	public static void main(String[] args) {
		
		/*
		 * "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir
uma classificação sobre a participação da pessoa no crime. Se
a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int resp = 0;
		
		
			
		System.out.println("Telefonou para a vítima? s/n ");
		String r1 = scan.next();		
		if (r1.equalsIgnoreCase("s") ){
			resp++;
		}
		
		System.out.println("Esteve no local do crime? s/n ");
		String r2 = scan.next();
		if (r2.equalsIgnoreCase("s") ){
			resp++;
		}
		
		System.out.println("Mora perto da vítima? ");
		String r3 = scan.next();
		if (r3.equalsIgnoreCase("s") ){
			resp++;
		}
		
		System.out.println("Devia para a vítima? ");
		String r4 = scan.next();
		if (r4.equalsIgnoreCase("s") ){
			resp++;
		}
		
		System.out.println("Já trabalhou com a vítima? ");
		String r5 = scan.next();
		if (r5.equalsIgnoreCase("s") ){
			resp++;
		}
		
		//System.out.println( resp );
		
		switch ( resp ){
		case 2: System.out.println("Suspeito"); break;
		case 3: 
		case 4: System.out.println("Cúmplice"); break;
		case 5: System.out.println("Assassino"); break;
		default: System.out.println("Inocente"); break;
		}

	}

}
