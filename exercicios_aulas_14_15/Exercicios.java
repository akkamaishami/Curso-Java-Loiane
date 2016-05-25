package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicios {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		/*
		System.out.print("Digite dois numeros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println(num1);
		}
			else System.out.println(num2);
		}

		scan = new Scanner (System.in);
		System.out.print("Digite um número: ");
		int num1 = scan.nextInt();
		if (num1 % 2 == 0){
			System.out.println("É par.");
		} else {
			System.out.println("É impar.");
		}

		System.out.print("Digite M ou F: ");
		String ltr = scan.next();
		if (ltr.equals("M")){
			System.out.print("Masculino");
		} else if (ltr.equals("F")){
			System.out.print("Feminino.");
		} else {
			System.out.print("Ferrou maluco!");
		}
		 */	
		System.out.print("Digite uma letra qualquer: ");
		String ltr = scan.next();
		if (ltr.length() > 1){
			System.out.print("Digite uma letra só, animal!");
		} else {
			switch (ltr){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.print("É vogal."); break;
			default: System.out.print("É consoante."); 
			}
		}
	}
}