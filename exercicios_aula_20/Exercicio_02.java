package exercicios_aula_20;

import java.util.Random;

public class Exercicio_02 {

	public static void main(String[] args) {

		int[][] M = new int[10][10];
		Random NR = new Random();
		int maior = 0;
		int menor = 100;

		for (int i=0; i<M.length; i++){
			for (int j=0; j<M[i].length; j++){
				M[i][j] = NR.nextInt(100);
				if (M[i][j] < 10){
					System.out.print("     0" +M[i][j]);
				}else{
					System.out.print("     " +M[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println("");
		for (int j=0; j<M.length; j++){
			if(M[5][j] > maior){ 
				maior = M[5][j];
			}
			if(M[5][j] < menor){ 
				menor = M[5][j];
			}
		}
		System.out.println("O maior número da linha 5 é: " +maior);
		if (menor < 10){
			System.out.println("O menor número da linha 5 é: 0" +menor);
		}else{
			System.out.println("O menor número da linha 5 é: " +menor);
		}
	}
}
