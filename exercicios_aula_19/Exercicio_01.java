package exercicios_aula_19;

public class Exercicio_01 {

	public static void main(String[] args) {

		int[] A = new int[5];
		int[] B = new int[5];
		int j = 11;

		System.out.print("Vetor A = ");
		for (int i=0; i<A.length; i++) {
			A[i] = j++;
			System.out.print(A[i]+" ");
		}
	
		System.out.println(" ");
		System.out.print("Vetor B = ");
		for (int i=0; i<=4; i++) {
			B[i] = A[i];
			System.out.print(B[i]+" ");
		}
		
		System.out.println("");
		System.out.println("Números em B: " +B[0]);
		System.out.println("Números em B: " +B[1]);
		System.out.println("Números em B: " +B[2]);
		System.out.println("Números em B: " +B[3]);
		System.out.println("Números em B: " +B[4]);

	}
} 


