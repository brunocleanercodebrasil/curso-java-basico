package cursojava.exercicios_2;

import java.util.Scanner;

public class CalculaMedia {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dgite a primeira nota do aluno.");
		double nt1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno.");
		double nt2 = scan.nextDouble();
		
		double media = (nt1 + nt2) / 2;
		
		if (media == 10){
			System.out.println("O aluno foi aprovado com distinção.");
		}else if (media >= 7 && media <10){
			System.out.println("Aluno aprovado. Parabéns!");
		} else {
			System.out.println("Aluno reprovado. Estude mais.");
		}
	
	}

}
