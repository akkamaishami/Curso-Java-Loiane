package exercicios_aula_19;

public class Exercicio_31 {

	public static void main(String[] args) {

		int[] A = new int[20];
		int[] B = new int[A.length];

		int count = 1;
		int cnt = 0;

		for (int i=0; i<A.length; i++){
			A[i] = count++;
			if (A[i]%2 == 0){
				B[cnt] = A[i];
				cnt ++;
			}

		}
		for (int i=0; i<A.length; i++){
			A[i] = count++;
			if (A[i]%2 != 0){
				B[cnt] = A[i];
				cnt ++;
			}

		}

		for (int i=0; i<A.length; i++){
			System.out.print(" " +B[i]);
		}

	}
}