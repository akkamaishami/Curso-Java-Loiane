package exercicios_aulas_25_a_27;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		String[][] conta = new String[5][5];
		
		conta[0][0] = "usr01";
		conta[1][0] = "usr02";
		conta[2][0] = "usr03";
		conta[3][0] = "usr04";
		conta[4][0] = "usr05";
		
		for (int i=0; i<conta.length; i++){
			for (int j=0; j<conta[i].length; j++){
				System.out.print(" " +conta[i][j]);
			}
			System.out.println("");
			
		}

		boolean encerra = false;
		int fazer;
		double vlr;
		String usr;

		ContaCorrente CTA01 = new ContaCorrente();
		CTA01.nomeConta = conta[0][0];
		CTA01.saldoConta = 2000;

		ContaCorrente CTA02 = new ContaCorrente();
		CTA02.nomeConta = conta[0][0];
		CTA02.saldoConta = 2000;

		while (!encerra){

			System.out.println(" ");
			System.out.println("O que deseja fazer: 1 - Saldo, 2 - Depósito, 3 - Saque, 4 - Sair.");
			fazer = scan.nextInt();

			switch (fazer){
			case 1:
				System.out.println("Saldo = " +CTA01.consultaSaldo()); break;

			case 2:
				System.out.print("Digite o valor a ser depositado: ");
				vlr = scan.nextDouble();
				CTA01.deposito(vlr);break;

			case 3:
				System.out.print("Digite o valor a ser sacado: ");
				vlr = scan.nextDouble();
				CTA01.saque(vlr);break;

			case 4:
				System.out.println("Saindo...");
				encerra = true;break;

			default:
				System.out.println("Sabe ler não?");
			}
		}
	}
}