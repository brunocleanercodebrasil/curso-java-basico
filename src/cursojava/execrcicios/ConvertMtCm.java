package cursojava.execrcicios;

import java.util.Scanner;

public class ConvertMtCm {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double centimetro;
		System.out.println("Digite o metro");
		double mtr = scan.nextDouble();
		
		centimetro = mtr*100;
		
		System.out.println(mtr + " metros = " + centimetro + " centimetros");
		System.out.println(mtr + " M = " + centimetro + " cm");
		
		
	}

}