package aula12;

import java.util.Scanner;

public class LendoTeclado {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner (System.in);

		System.out.println("Digite os dados como se pede: ");
		System.out.print("Digite seu nome: ");
		String nome = scan.next();
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.print("Digite sua altura: ");
		float altura = scan.nextFloat();

		System.out.println("Os dados digitados foram: " +nome+ " " +idade+ " " +altura);
	}
}