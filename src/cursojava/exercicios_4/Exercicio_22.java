package cursojava.exercicios_4;

public class Exercicio_22 {

	public static void main(String[] args) {
	
		int qtd0 = 0;
		int qtd1 = 0;
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++){
			vetorA[i] = (int)Math.round(Math.random() * 1);
			
			if (vetorA[i] == 0){
				qtd0++;
			}else{
				qtd1++;
			}
		}
		
		double porc0 = (qtd0 *100 )/ 10;
		double porc1 = (qtd1 *100 )/ 10;
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Porc 0 = " + porc0);
		System.out.println("Porc 1 = " + porc1);
		
		
	}

}
