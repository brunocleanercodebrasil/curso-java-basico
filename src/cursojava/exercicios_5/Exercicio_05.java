package cursojava.exercicios_5;

import java.util.Scanner;

public class Exercicio_05 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][][] agenda = new String[12][31][24];
			
		boolean sair = false;
		int opcao;
		int mes = 0;
		int dia = 0;
		int hora = 0;
		
		while (!sair){
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("digite 0 para sair");
			opcao = scan.nextInt();
			
				if (opcao == 1){
					
					boolean mesValido = false;
					while (!mesValido){
						System.out.println("Digite um mês");
						mes = scan.nextInt();
						if (mes > 0 && mes<= 12){
							mesValido = true;
						}else{
							System.out.println("mês inválido. Tente novamente.");
						}
					}		
				
					boolean diaValido = false;
					while (!diaValido){
						System.out.println("Digite um dia do mês");
						dia = scan.nextInt();
						if (dia > 0 && dia<= 31){
							diaValido = true;
						}else{
							System.out.println("Dia inválido. Tente novamente.");
						}
					}
				
					boolean horaValida = false;
					while (!horaValida){
						System.out.println("Digite uma hora do dia");
						hora = scan.nextInt();
						if (hora >= 0 && hora<= 23){
							horaValida = true;
						}else{
							System.out.println("Hora inválida. Tente novamente.");
						}
					}
					mes--;
					dia--;
					System.out.println("Digite o compromisso");
					agenda[mes][dia][hora] = scan.next();
					
				}else if (opcao == 2){
					
					boolean mesValido = false;
					while (!mesValido){
						System.out.println("Digite um mês");
						mes = scan.nextInt();
						if (mes > 0 && mes<= 12){
							mesValido = true;
						}else{
							System.out.println("mês inválido. Tente novamente.");
						}
					}		
				
					
				
					boolean diaValido = false;
					while (!diaValido){
						System.out.println("Digite um dia do mês");
						dia = scan.nextInt();
						if (dia > 0 && dia<= 31){
							diaValido = true;
						}else{
							System.out.println("Dia inválido. Tente novamente.");
						}
					}
					
					boolean horaValida = false;
					while (!horaValida){
						System.out.println("Digite uma hora do dia");
						hora = scan.nextInt();
						if (hora >= 0 && hora<= 23){
							horaValida = true;
						}else{
							System.out.println("Hora inválida. Tente novamente.");
						}
					}
					mes--;
					dia--;
					System.out.println("O compromisso agendado é");
					System.out.println(agenda[mes][dia][hora]);
					
					
				}else if (opcao == 0){
					sair = true;
				}else{
					System.out.println("Opção inválida. Digite novamente.");
				}
		}		
		
	}
	
}
