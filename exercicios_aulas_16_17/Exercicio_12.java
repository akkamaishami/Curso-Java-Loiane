package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int tabu;
		String op;
		
		System.out.print("Tabuada do número: ");
		tabu = scan.nextInt();
		
		System.out.print("Operador matemático: ");
		op = scan.next(); 
		
		switch (op){
		case "+": op = "+"; break;
		case "-": op = "-"; break;
		case "*": op = "*"; break;
		case "/": op = "/"; break;
		default: System.out.println("Digite um operador válido: ");
		}
		
		for (int i=1; i <=10; i++) {
			System.out.println(tabu + " " + op + " " + i + " = " + (tabu + op.charAt(1)));
		}
		
	}

}
