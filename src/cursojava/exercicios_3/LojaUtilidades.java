package cursojava.exercicios_3;

public class LojaUtilidades {

	
	
	public static void main(String[] args) {
		double precoUn = 1.99;
		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for (int i = 1; i <= 50; i++){
			
			System.out.println(i + " - R$ " + (i * precoUn) );
			
		}

	}

}
