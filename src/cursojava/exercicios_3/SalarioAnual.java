package cursojava.exercicios_3;

import java.text.DecimalFormat;
//import java.text.Format;
//import java.util.Scanner;

public class SalarioAnual {

	
	public static void main(String[] args) {
	
		//Scanner scan = new Scanner(System.in);
		
		double salario = 1000; //1995
		double percentual = 1.5; //1996
		salario += (salario / 100) * percentual; //1996
		 
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for (int i = 1997; i <= 2015; i++){
			
			percentual *= 2;
			
			salario += (salario / 100) * percentual; //1996
			
			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
		}
		

	}

}
