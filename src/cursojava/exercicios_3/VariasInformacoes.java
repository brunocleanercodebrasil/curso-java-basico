package cursojava.exercicios_3;

import java.util.Scanner;

public class VariasInformacoes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*a. Nome: maior que 3 caracteres;
		b. Idade: entre 0 e 150;
		c. Salário: maior que zero;
		d. Sexo: 'f' ou 'm';
		e. Estado Civil: 's', 'c', 'v', 'd';
		 */
		boolean infValida = false;
		String nome, sexo, estCivil;
		int idade;
		double salario;
		
		do{
			
			System.out.println("Entre com o nome:");
			nome = scan.next();
			
			if (nome.length() >= 3){
				infValida = true;
			}else {
				System.out.println("O nome precisa de no mínimo de 3 caracteres.");
			}
			
		}while(!infValida);
		
		infValida = false;
		
		do{
			
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();
			
			if ( idade >= 0 && idade <= 150 ){
				infValida = true;
			}else {
				System.out.println("A idade precisa ser entre 0 e 150.");
			}
			
		}while(!infValida);

		infValida = false;
		
		do{
			
			System.out.println("Entre com o salário:");
			salario = scan.nextDouble();
			
			if ( salario > 0.0 ){
				infValida = true;
			}else {
				System.out.println("O salário precisa ser maior que 0.");
			}
			
		}while(!infValida);
		
		infValida = false;
		
		do{
			
			System.out.println("Entre com o sexo:");
			sexo = scan.next();
			
			if ( sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
				infValida = true;
			}else {
				System.out.println("Sexo precisa ser 'f' ou 'm' .");
			}
			
		}while(!infValida);
		
		infValida = false;
		
		do{
			
			System.out.println("Entre com o estado civil.");
			estCivil = scan.next();
			
			if ( estCivil.equalsIgnoreCase("s") ||
					estCivil.equalsIgnoreCase("c") ||
						estCivil.equalsIgnoreCase("v") || 
							estCivil.equalsIgnoreCase("d")){
				infValida = true;
			}else {
				System.out.println("O estado civil precisa ser 's', 'c', 'v' ou 'd'.");
			}
			
		}while(!infValida);
		
		
		System.out.println( "As seguintes informações foram coletadas." );
		System.out.println("Nome: " + nome );
		System.out.println("Idade: " + idade );
		System.out.println("Salário: " + salario );
		System.out.println("Sexo: R$ " + sexo );
		System.out.println("Estado civil: " + estCivil );

	}

}
