package exercicios_aulas_25_a_27;

import java.util.Scanner;

public class ContaCorrente {

	Scanner scan = new Scanner(System.in);

	String nomeConta;
	double saldoConta;
	double limite;
	String usuario;
	boolean encerra = false;
	int fazer;
	double vlr;
	String usr;

	double saque(double vlrSaque){
		return saldoConta -= vlrSaque;
	}

	double deposito(double vlrDeposito){
		return saldoConta += vlrDeposito;
	}

	double consultaSaldo(){
		return saldoConta;
	}

	String usr(String usr){
		return usr;
	}

}
