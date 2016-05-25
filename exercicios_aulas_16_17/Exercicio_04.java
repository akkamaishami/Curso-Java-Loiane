package exercicios_aulas_16_17;

public class Exercicio_04 {

	public static void main(String[] args) {

		int hbPA = 80000;
		int hbPB = 200000;

		int count = 0;

		while (hbPA < hbPB) {

			hbPA += (hbPA * 3) / 100;
			hbPB += (hbPB * 1.5) / 100;
			count++;

			System.out.println(+hbPA+ " " +hbPB+ " " +count);

		}
	}
}