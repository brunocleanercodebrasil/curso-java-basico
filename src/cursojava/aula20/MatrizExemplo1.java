package cursojava.aula20;

public class MatrizExemplo1 {
	
	
	public static void main(String[] args) {
		
		//Introdu��o e pr�tica
		//manipula��o
		
		//Armazenar 4 notas do ano de 30 alunos
		//utilizar matriz bi dimensional
		
		double[][] notasAlunos = new double[3][4]; 
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for (int i=0; i<notasAlunos.length; i++){
			for (int j=0; j<notasAlunos[i].length; j++){
				
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a m�dia de cada aluno.");
		double soma;
		
		for (int i=0; i<notasAlunos.length; i++){
			soma = 0;
			
			for (int j=0; j<notasAlunos[i].length; j++){
				soma+=notasAlunos[i][j];
				
			}
			System.out.println("A m�dia do aluno " + (i+1) + " = " + (soma / 4) );
			System.out.println(notasAlunos.length);
		}
		
	}

}
