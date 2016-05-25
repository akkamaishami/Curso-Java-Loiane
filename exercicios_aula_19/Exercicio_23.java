package exercicios_aula_19;

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] A = new int[5];

		boolean flag = false;

		//while (!flag){

		for (int i=0; i<A.length; i++){
			System.out.println("Digite um número: ");
			A[i] = scan.nextInt();
			if (A[i]%2 != 0){
				break;

			}
		}

		for (int i=0; i<A.length; i++){
			System.out.print(A[i]+" ");

		}

	}
}