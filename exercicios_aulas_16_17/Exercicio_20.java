package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		float valorProduto = 0;
		float valorTotal = 0;
		boolean fimCompra = false;
		float valorPago = 0;

		System.out.println("LOJAS TABAJARA:");
		System.out.println("");
		System.out.println("DIGITE ZERO PARA SAIR");
		System.out.println("");

		while (fimCompra == false){

			for (int i=1; i>0; i++) {
				
				System.out.print("Produto " +i+ " - R$ ");
				valorProduto = scan.nextFloat();
				valorTotal += valorProduto;
				if (valorProduto == 0){
					System.out.println("Quantidade de items: " + (i-1));
					fimCompra = true; break;
				}
			}
			System.out.println("Valor Total da Compra: " +valorTotal);
			System.out.print("Valor Recebido: ");
			valorPago = scan.nextFloat();
			System.out.println("Troco: " + (valorPago - valorTotal));
		}
	}
}