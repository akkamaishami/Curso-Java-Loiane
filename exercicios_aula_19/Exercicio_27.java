package exercicios_aula_19;

import java.util.Scanner;

public class Exercicio_27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		int[] A = new int[10];
		char[] B = new char [A.length];
		
		for (int i=0; i<A.length; i++){
			System.out.print("Digite os números: ");
			A[i] = scan.nextInt();
			
			if (A[i] < 7){
				B[i] = 'a';
			}else if (A[i] == 7){
				B[i] = 'b';
			}else if (A[i] > 7 && A[i] < 10){
				B[i] = 'c';
			}else if (A[i] == 10){
				B[i] = 'd';
			}else if (A[i] > 10){
				B[i] = 'e';
			}
						
		}
		
		for (int i=0; i<A.length; i++){
			System.out.print(" " +B[i]);
		}
		

	}

}
