package br.com.carlosFreitas.exercicios.aula019;

public class RespectivaMultiplicacaoPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 16, 18, 30};
        int[] b = new int[15];

        for (int i = 0; i < a.length; i++){
            b[i] = a[i] * i;
            System.out.print(b[i] + ", ");
        }
	}

}
