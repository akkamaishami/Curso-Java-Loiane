package exercicios_aulas_11_12_13;

import java.util.Scanner;

public class Exercicios {

	//private static Scanner scan2;
	//private static Scanner scan;

	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite dois numeros: ");
		int num = scan.nextInt();
		System.out.println("O primeiro numero digitado foi: " +num);
		System.out.println("A soma dos dois é: " + (num + scan.nextInt()));	
		//scan.close();
				
	}

}
