package br.com.carlosFreitas.exercicios.aula019;

public class DivisaoAeB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] b = {3, 6, 9, 12, 15, 18, 21, 23, 27, 30};
        double[] c = new double[10];

        for (int i = 0; i < a.length; i++){
            c[i] = a[i] / b[i];
            System.out.print(c[i] + ", ");
        }
	}

}
