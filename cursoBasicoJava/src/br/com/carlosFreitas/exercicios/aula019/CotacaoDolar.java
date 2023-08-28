package br.com.carlosFreitas.exercicios.aula019;

public class CotacaoDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double DOLAR = 5.71;
        double[] real = new double[21];

        for (int i = 1; i < real.length; i++) {
            real[i] = DOLAR * i;
            System.out.println(i+ "-U$: "+ real[i]);
        }
	}

}
