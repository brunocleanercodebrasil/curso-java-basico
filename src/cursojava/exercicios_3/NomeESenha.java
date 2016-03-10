package cursojava.exercicios_3;

import java.util.Scanner;

public class NomeESenha {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean nomeDifSenha = false; 
		String nome;
		String senha;
		
		do{
			System.out.println("Entre com um nome de email");
			nome = scan.next();
			
			System.out.println("Entre com uma senha");
			senha = scan.next();
			
			if ( nome.equalsIgnoreCase(senha)){
				System.out.println("Nome de usuário e senha iguais. Digite novamente.");
			}else {
				System.out.println("Login e senha válidos");
				nomeDifSenha = true;
			}
			
		}while(!nomeDifSenha);
			
	}

}
