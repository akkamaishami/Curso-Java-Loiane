package exercicios_aulas_25_a_27;

import java.util.Scanner;

public class Exercicio_01 {

	private static Scanner scan;

	public static void main (String[] args){

		scan = new Scanner (System.in);
		Lampada lamp = new Lampada();
		int doIt;
		boolean saiLoop = false;


		while (!saiLoop){

			System.out.println(" ");
			System.out.println("Digite 0 pra desligar, 1 para ligar e 2 para sair: ");
			doIt = scan.nextInt();

			switch (doIt){

			case 0:
				if (lamp.onOff){
					System.out.println("Desligando...");
					lamp.desligar();
				}else{
					System.out.println("Lâmpada já está desligada."); 
				}
				break;

			case 1:
				if (!lamp.onOff){
					System.out.println("Ligando...");
					lamp.ligar();
				}else{
					System.out.println("Lâmpada já está ligada.");
				}
				break;

			case 2:
				System.out.println("Saindo...");
				saiLoop = true;

			}
		}


	}

}
