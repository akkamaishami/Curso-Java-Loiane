package exercicios_aula_19;

public class Exercicio_28 {

	public static void main(String[] args) {

		int[] A = new int[35];
		int[] B = new int[A.length];

		int countA = 1;
		int countB = B.length;


		for (int i=0; i<A.length; i++){
			A[i] = countA++;
			B[i] = countB--;
		}

		for (int i=0; i<A.length; i++){
			System.out.print(" " +A[i]);
		}

		System.out.println(" ");

		for (int i=0; i<B.length; i++){
			System.out.print(" " +B[i]);

		}

	}

}
