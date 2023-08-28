package br.com.carlosFreitas.exercicios.aula019;

public class QuadradoDoElementoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
        double[] b = new double[15];

        for (int i = 0; i < a.length; i++){
            b[i] = Math.pow(a[i], 2);
            System.out.print(b[i] + ", ");
        }
	}

}
