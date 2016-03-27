package cursojava.exercicios_4;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];
		double meta = 7;
		
		System.out.println("\n\nPrimeira Prova");
		for (int i=0; i<notas1.length; i++){
			System.out.println("Entre com a nota 1 do aluno" + (i+1));
			notas1[i] = scan.nextDouble();
		}
		
		System.out.println("\n\nSegunda Prova");
		for (int i=0; i<notas2.length; i++){
			System.out.println("Entre com a nota 2 do aluno" + (i+1));
			notas2[i] = scan.nextDouble();
			
			resultados[i] = (notas1[i] + notas2[i])/2;
		}
		
		for(int i=0; i<notas1.length; i++){
			
			System.out.println("\nnota do aluno" + (i+1));
			System.out.println("nota1: " + notas1[i]);
			System.out.println("nota2: " + notas2[i]);
			System.out.println("Média: " + resultados[i]);
			
			if (resultados[i] >= meta){
				System.out.println("Situação: Aprovado.");
			}else{
				System.out.println("Situação: Reprovado.");
			}
			
		}
		
	}

}
