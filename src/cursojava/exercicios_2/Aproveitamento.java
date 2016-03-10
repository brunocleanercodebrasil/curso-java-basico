package cursojava.exercicios_2;

import java.util.Scanner;

public class Aproveitamento {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota do primeiro semestre: ");
		double nt1 = scan.nextDouble();
		
		System.out.println("Nota do segundo semestre: ");
		double nt2 = scan.nextDouble();
		
		double media = ( nt1 + nt2 ) / 2;
		String conceito;
		String result;
		/*Média de Aproveitamento Conceito
		Entre 9.0 e 10.0 A
		Entre 7.5 e 9.0 B
		Entre 6.0 e 7.5 C
		Entre 4.0 e 6.0 D
		Entre 4.0 e zero E
		*/
		
		if ( media >= 0 && media < 4 ){
			conceito = "E";
		}else if ( media >= 4 && media < 6 ){
			conceito = "D";
		}else if ( media >= 6 && media < 7.5 ){
			conceito = "C";
		}else if ( media >= 7.5 && media < 9){
			conceito = "B";
		}else {
			conceito = "A";
		}

		/*O algoritmo deve mostrar na tela as notas, a média, o conceito
		correspondente e a mensagem “APROVADO” se o conceito for
		A, B ou C ou “REPROVADO” se o conceito for D ou E.
		*/
		
		if (conceito.equals("D")){
			result = "Reprovado";
		}else if ( conceito.equals("E") ){
			result = "Reprovado";
		}else {
			result = "Aprovado";
		}
			
		System.out.println("Nota primeiro semestre: " + nt1);
		System.out.println("Nota segundo semestre:  " + nt2);
		System.out.println("Media das notas:\t" + media);
		System.out.println("Conceito:\t\t" + "\"" + conceito + "\"");
		System.out.println("Resultado:\t\t" + result);
		
		
	}

}
