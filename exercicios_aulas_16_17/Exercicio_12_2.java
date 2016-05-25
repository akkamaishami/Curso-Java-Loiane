package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio_12_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Tabuada do número: ");
		int tabu = scan.nextInt();
		
		System.out.print("Operador matemático: ");
		String op = scan.next(); 
		
		switch (op){
		case "+":
			System.out.println(tabu+ " + 1 = " +tabu + 1);
			System.out.println(tabu+ " + 2 = " +tabu + 2);
			System.out.println(tabu+ " + 3 = " +tabu + 3);
			System.out.println(tabu+ " + 4 = " +tabu + 4);
			System.out.println(tabu+ " + 5 = " +tabu + 5);
			System.out.println(tabu+ " + 6 = " +tabu + 6);
			System.out.println(tabu+ " + 7 = " +tabu + 7);
			System.out.println(tabu+ " + 8 = " +tabu + 8);
			System.out.println(tabu+ " + 9 = " +tabu + 9);
		case "-": op = "-"; break;
		case "*":
			System.out.println(tabu+ " * 1 = " +tabu * 1);
			System.out.println(tabu+ " * 2 = " +tabu * 2);
			System.out.println(tabu+ " * 3 = " +tabu * 3);
			System.out.println(tabu+ " * 4 = " +tabu * 4);
			System.out.println(tabu+ " * 5 = " +tabu * 5);
			System.out.println(tabu+ " * 6 = " +tabu * 6);
			System.out.println(tabu+ " * 7 = " +tabu * 7);
			System.out.println(tabu+ " * 8 = " +tabu * 8);
			System.out.println(tabu+ " * 9 = " +tabu * 9);
		case "/": op = "/"; break;
		default: System.out.println("Digite um operador válido: ");
		}

	}

}