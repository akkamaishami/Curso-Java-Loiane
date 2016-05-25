package exercicios_aula_19;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		int[] A = new int [10];
		
		int j = 0;
		int k = 0;
				
		for(int i=0;i<A.length;i++){
		A[i] = ++j;
		k += A[i];
		
		}
		
		System.out.println(k);

	}

}
