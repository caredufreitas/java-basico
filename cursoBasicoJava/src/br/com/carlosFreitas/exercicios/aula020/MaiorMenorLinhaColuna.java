package br.com.carlosFreitas.exercicios.aula020;

import java.util.Random;

public class MaiorMenorLinhaColuna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[10][10];
		Random numeroRandom = new Random();

		for (int  i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				m[i][j] = numeroRandom.nextInt(100);
			}
		}

		for (int  i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n========================================");
		//maior menor da linha 5
		int maiorL5 = 0;
		int menorL5 = 0;
		final int LINHA5 = 5;
		System.out.println("Linha 05");
		for (int i = 0; i < m[LINHA5].length; i++){
			System.out.print(m[LINHA5][i] + " ");
			if(m[LINHA5][i] > maiorL5){
				maiorL5 = m[LINHA5][i];
			}
			if(m[LINHA5][i] < menorL5){
				menorL5 = m[LINHA5][i];
			}
		}
		System.out.println("\n========================================");
		//        maior menor coluna 7
		int maiorCol7 = 0;
		int menorCol7 = 0;
		final int COLUNA7 = 7;
		System.out.println("Coluna 07");
		for (int i = 0; i < m.length; i++){
			System.out.print(m[i][COLUNA7] + " ");
			if(m[i][COLUNA7] > maiorCol7){
				maiorCol7 = m[i][COLUNA7];
			}
			if(m[i][COLUNA7] < menorCol7){
				menorCol7 = m[i][COLUNA7];
			}
		}
		System.out.println("\n========================================");
		System.out.println("O maior valor da linha 05: " + maiorL5);
		System.out.println("O menor valor da linha 05: " + menorL5);
		System.out.println("O maior valor da coluna 07: " + maiorCol7);
		System.out.println("O menor valor da coluna 07: " + menorCol7);
		System.out.println("========================================");
	}

}
