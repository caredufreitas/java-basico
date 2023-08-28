package br.com.carlosFreitas.exercicios.aula017;

import java.text.DecimalFormat;

public class PopulacaoPais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long A = 80000L;
        final long B = 200000L;
        final int ano = 12;

        DecimalFormat df = new DecimalFormat("#.##");

        double crecimentoA = (A * 3) / 100;
        double crescimentoB = (B * 1.5) / 100;
        double pop = crescimentoB - crecimentoA;
        int total = (int) pop / ano;

        System.out.println("Em um ano A cresce: " + df.format(crecimentoA));
        System.out.println("Em um ano B cresce: " + df.format(crescimentoB));
        System.out.println("B tem um diferença de " + df.format(pop) + " sobre A. ");
        System.out.println("O total de anos para A ultrapasse ou iguale a B é " + total+ " anos.");
	}

}
