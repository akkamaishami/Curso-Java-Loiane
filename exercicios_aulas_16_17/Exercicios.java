package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicios {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);

		boolean igual = false;
		String usr;
		String pass;

		do {
			System.out.println("Digite o username ");
			usr = scan.nextLine();
			System.out.println("Digite a senha:");
			pass = scan.nextLine();

			if (usr.equals(pass)){
				System.out.println("USR e PASS não podem ser iguais.");
			}else{
				igual = true;
			}
		} while (!igual);
		System.out.println("USR e PASS criados com sucesso!");
	}
}

