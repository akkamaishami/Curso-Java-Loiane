package exercicios_aula_20;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] M = new int[3][3];
		int num=0, par=0, impar=0;

		for (int i=0; i<M.length; i++){
			for (int j=0; j<M[i].length; j++){
				System.out.print("Entre com um número: ");
				M[i][j] = scan.nextInt();
				if (M[i][j]%2 == 0){
					par++;
				}else{
					impar++;
				}
			}
		}

		System.out.println("");
		System.out.println("MATRIZ: ");
		System.out.println("");
		for (int i=0; i<M.length; i++){
			for (int j=0; j<M[i].length; j++){
				System.out.print("  " +M[i][j]);
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("Quantidade de pares: " +par);
		System.out.println("Quantidade de impares: " +impar);

	}
}

