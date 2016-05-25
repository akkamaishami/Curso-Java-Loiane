package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicios_6 {

	public static void main(String[] args) {
		System.out.print("Digite três números: ");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3){
			System.out.println(num1+ " é maior.");
		} else if (num2 > num1 && num2 > num3){
			System.out.println(num2+ " é maior.");
		} else {
			System.out.println(num3+ " é maior.");
		}

	}

}
