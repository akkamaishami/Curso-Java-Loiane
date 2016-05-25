package exercicios_aula_19;

public class Exercicio_30 {

	public static void main(String[] args) {

		int[] A = new int[20];
		int[] B = new int[A.length];
		int[] C = new int[A.length];

		int count = 1;

		for (int i=0; i<A.length; i++){
			A[i] = count++;
			if (A[i]%2 == 0){
				B[i] = A[i];
			}else{
				C[i] = A[i];
			}
		}

		for (int i=0; i<A.length; i++){
			System.out.print(" " +A[i]);
		}

		System.out.println("");
		for (int i=0; i<A.length; i++){

			if (B[i] != 0){
				System.out.print(" " +B[i]);
			}
		}

		System.out.println("");
		for (int i=0; i<A.length; i++){
			if (C[i] != 0){
				System.out.print(" " +C[i]);
			}
		}
	}
}
  