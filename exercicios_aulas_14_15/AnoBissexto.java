package exercicios_aulas_14_15;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o ano desejado no formato XXXX: ");

		int ano = scan.nextInt();

		String anoToString = Integer.toString(ano);

		if (anoToString.length() != 4){
			System.out.println("Atente para o formato XXXX!");

		} else {

			if ((ano % 4 == 0 && ano % 100 != 0)){
				System.out.println("O ano é Bissexto!");

			} else {
				System.out.println("O ano NÃO é Bissexto!");
			}

		}
	}
}

