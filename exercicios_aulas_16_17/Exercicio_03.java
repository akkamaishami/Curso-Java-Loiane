package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio_03 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner (System.in);

		boolean nomeValido = false;
		boolean idadeValida = false;
		boolean salarioValido = false;
		boolean sexoValido = false;
		boolean estadoValido = false;
		int idade = 0;
		double salario;
		String nome, marry, sexo;
		/////////////////////////////////////////
		do {
			System.out.println("Digite o nome: ");
			nome = scan.nextLine();

			if (nome.length() < 3){
				System.out.println("Nome não pode ter menos que 3 caracteres.");
			}else{
				nomeValido = true;
			}
		} while (!nomeValido);
		/////////////////////////////////////////
		while (!idadeValida){
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();

			if (idade <= 0 || idade > 150){
				System.out.println("Idade não pode ser negativa, zero ou maior que 150.");
				idadeValida = false;
			}else{
				idadeValida = true;
			}
		}

		/////////////////////////////////////////

		do {
			System.out.println("Digite o salário: ");
			salario = scan.nextDouble();
			if (salario <=0){
				System.out.println("Salário inválido");
			}else{
				salarioValido = true;
			}
		}while (!salarioValido);
		
		///////////////////////////////////////

		while (!sexoValido){
			System.out.println("Digite o sexo F ou M: ");
			sexo = scan.next();

			if (sexo.equals("M") || sexo.equals("F")){
				sexoValido = true;
			}else{
				sexoValido = false;
			}
		}

		///////////////////////////////////////

		do {
			System.out.println("Estado Civil S C V D: ");
			marry = scan.next();
			switch (marry){
			case "s": estadoValido = true; break;
			case "c": estadoValido = true; break;
			case "v": estadoValido = true; break;
			case "d": estadoValido = true; break;
			default: System.out.println("Digite um estado válido.");
			}
		} while (!estadoValido);
	}
}