package exercicios_aula_19;

public class Exercicio_11 {

	public static void main(String[] args) {

		int par = 0;
		int impar = 0;

		double[] A = new double[570537];
		int j = 1;

		for (int i=0; i<A.length; i++) {
			A[i] = j++;
			if(A[i]%2 == 0){
				//System.out.println("É Impar.");
				par++;
			}else{
				//System.out.println("É Par.");
				impar++;
			}

		}
		System.out.println(+par);
		System.out.println(+impar);
	}
}