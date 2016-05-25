package exercicios_aula_20;

public class Exercicio_01 {

	public static void main(String[] args) {

		int rand[][] = new int [4][4];
		int count = 1; 

		for (int i=0; i<rand.length; i++){
			for (int j=0; j<rand[i].length; j++){
				rand [i][j] = count++;
				System.out.print("  " +rand[i][j]);
			}

			//System.out.println();
		}


	}
}
