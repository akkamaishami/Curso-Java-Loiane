package exercicios_aula_20;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] agenda = new String[31][24];
		int dia = 0, hora = 0;
		boolean diaValido = false;
		boolean horaValida = false;
		boolean fimProg = false;
		String fazer;

		while (!fimProg){

			System.out.println("");
			System.out.println("AGENDA: ");
			System.out.println("");
			System.out.print("Digite a letra correspondente ao que deseja fazer. (I)nserir, (V)er, (A)pagar, (T)abela, (S)air: ");
			fazer = scan.next();

			switch (fazer){
			case "i":

				while (!diaValido){
					System.out.print("Digite o dia do mês (01 - 31): ");
					dia = scan.nextInt() -1;
					if (dia < 0 || dia > 31){
						System.out.println("Dia inválido.");
					}else{
						diaValido = true;
						while (!horaValida){
							System.out.print("Digite a hora do dia: (00 - 23): ");
							hora = scan.nextInt();
							if (hora < 0 || hora > 23){
								System.out.println("Hora inválida.");
							}else{
								horaValida = true;
							}
						}

						System.out.print("Digite o compromisso: ");
						agenda[dia][hora] = scan.next();
					}
				} 
				diaValido = false;
				horaValida = false;
				break;

			case "v": 

				while (!diaValido){
					System.out.print("Digite o dia do mês (01 - 31): ");
					dia = scan.nextInt() -1;
					if (dia < 0 || dia > 31){
						System.out.println("Dia inválido.");
					}else{
						diaValido = true;
						while (!horaValida){
							System.out.print("Digite a hora do dia: (00 - 23): ");
							hora = scan.nextInt();
							if (hora < 0 || hora > 23){
								System.out.println("Hora inválida.");
							}else{
								horaValida = true;
							}
						}
						if (agenda[dia][hora] != null){
							System.out.println("Os compromissos do dia " +(dia+1)+ " às " +hora+ " horas são: " +agenda[dia][hora]);
						}else{
							System.out.println("Você não tem compromisso para o dia " +(dia+1)+ " às " +hora+ " horas.");
						}
					}
				}
				diaValido = false;
				horaValida = false;
				break;

			case "a":

				while (!diaValido){
					System.out.print("Digite o dia do mês (01 - 31): ");
					dia = scan.nextInt() -1;
					if (dia < 0 || dia > 31){
						System.out.println("Dia inválido.");
					}else{
						diaValido = true;
						while (!horaValida){
							System.out.print("Digite a hora do dia: (00 - 23): ");
							hora = scan.nextInt();
							if (hora < 0 || hora > 23){
								System.out.println("Hora inválida.");
							}else{
								horaValida = true;
							}
						}
						agenda[dia][hora] = null;
						System.out.println("Compromisso apagado!");
					}
				}
				diaValido = false;
				horaValida = false;
				break;

			case "t":
				
				System.out.println();
				for (int i=0; i<agenda.length; i++){
					for (int j=0; j<agenda[i].length; j++){
						System.out.print(" " +agenda[i][j]);
					}

					System.out.println();
				}
			
			case "s": 

				diaValido = false;
				horaValida = false;
				fimProg = true;
				break;

			default: 
				System.out.println("Opção Inválida!");

			}

		}
	}
}
