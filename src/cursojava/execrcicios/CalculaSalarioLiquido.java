package cursojava.execrcicios;

import java.util.Scanner;

public class CalculaSalarioLiquido {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		double horTrab = scan.nextDouble();
		
		double bruto = ganhoHora * horTrab;
		
		//System.out.println("Seu salário é de " + salario);
		
		//11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
		
		double contrIR = bruto * 0.11;
		double contrINSS = bruto * 0.08;
		double ContrSind = bruto * 0.05;
		double descontos = contrIR + contrINSS + ContrSind;
		double liquido = bruto - descontos;
		
		System.out.println("Salário bruto: R$" + bruto);
		System.out.println("Desconto IR: R$" + contrIR);
		System.out.println("Desconto INSS: R$" + contrINSS);
		System.out.println("Contribuição Sindical: R$" + ContrSind);
		System.out.println("Total de descontos: R$" + descontos);
		System.out.println("Valor Líquido: R$" + liquido );
	}

}
