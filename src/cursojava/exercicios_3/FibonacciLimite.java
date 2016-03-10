package cursojava.exercicios_3;
public class FibonacciLimite {

	
	
	public static void main(String[] args) {
		
		int primeiro = 1;
		int segundo = 1;
		int prox = 0;
		
		System.out.print(primeiro + " ");
		System.out.print(segundo + " ");
		
		while (prox <= 500){
			prox = primeiro + segundo;
			primeiro = segundo;
			segundo = prox;
			
			System.out.print(prox + " ");
		}

	}

}
