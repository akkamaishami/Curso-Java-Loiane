package exercicios_aula_19;

public class Exercicio_29 {

	public static void main(String[] args) {

		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[A.length*2];

		int numA = 1; 
		int numB = A.length + 1;
		//int numC = A.length;

		for (int i=0; i<A.length; i++){
			A[i] = numA++;
			B[i] = numB++;
			C[i] = A[i];
			C[A.length + i] = B[i];
			//numC++;

		}

		for (int i=0; i<A.length; i++){
			System.out.print(" " +A[i]);
		}

		System.out.println("");
		for (int i=0; i<B.length; i++){
			System.out.print(" " +B[i]);
		}

		System.out.println("");
		for (int i=0; i<C.length; i++){
			System.out.print(" " +C[i]);
		}

	}

}
