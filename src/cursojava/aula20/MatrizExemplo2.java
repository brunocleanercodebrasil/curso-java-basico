package cursojava.aula20;

public class MatrizExemplo2 {

	
	public static void main(String[] args) {
	
		//double[] notasAluno1 = {7, 8, 9, 10};
		
		double[][] notasAluno2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
		
		for (int i=0; i<notasAluno2.length; i++){
			for (int j=0; j<notasAluno2[1].length; j++){
				
				System.out.print(notasAluno2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
