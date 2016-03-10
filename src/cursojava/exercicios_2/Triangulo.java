package cursojava.exercicios_2;

import java.util.Scanner;

public class Triangulo {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro lado:");
		double ld1 = scan.nextDouble();
						
		System.out.println("Segundo lado:");
		double ld2 = scan.nextDouble();
		
		System.out.println("Terceiro lado:");
		double ld3 = scan.nextDouble();

		
		if ( ( (ld1 + ld2) > ld3 ) || ( (ld1 + ld3) > ld2 ) || ( (ld2 + ld3) > ld1 )){
			
			if (ld1 == ld2 && ld1 == ld3 && ld2 == ld3){
				System.out.println("Triângulo Equilátero.");
			}else if (ld1 != ld2 && ld1 != ld3 && ld3 != ld2){
				System.out.println("Triângulo Escaleno.");
			}else if (ld1 == ld2 || ld1 == ld3 || ld2 == ld3){
				System.out.println("Triângulo Isósceles.");
			}
		
		}else{
			System.out.println("Não é um triângulo.");
		}

	}

}
