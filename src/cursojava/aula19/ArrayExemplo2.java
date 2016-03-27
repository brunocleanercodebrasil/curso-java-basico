package cursojava.aula19;

public class ArrayExemplo2 {

	
	public static void main(String[] args) {
		
double[] temperaturas = new double[365];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32.3;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 31.1;
		temperaturas[5] = 37.1;
		
		for (double temp: temperaturas){
			
			System.out.println(temp);
		}

	}

}
