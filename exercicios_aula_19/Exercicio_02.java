 package exercicios_aula_19;

public class Exercicio_02 {

	public static void main(String[] args) {

		double[] A = new double[9];
		double[] B = new double[9];
		int j = 1;

		for (int i=0; i<=A.length-1; i++) {
			A[i] = j++;
			System.out.print(A[i]+" ");
		}
		System.out.println("");
		for (int i=0; i<=B.length-1; i++) {
			B[i] = A[i]*i;
			System.out.print(B[i]+" ");
		}

	}

}
