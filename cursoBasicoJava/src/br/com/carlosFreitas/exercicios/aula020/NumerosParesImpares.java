package br.com.carlosFreitas.exercicios.aula020;

import java.util.Scanner;

public class NumerosParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] m = new int[3][3];
		int totPar = 0, totImpar = 0;
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				System.out.print("Digite um número para posição [" + i+ "][" + j+ "]: ");
				m[i][j] = scan.nextInt();
				if(m[i][j] % 2 == 0){
					totPar++;
				}else{
					totImpar++;
				}
			}
		}
		System.out.println("O total de números par: " + totPar);
		System.out.println("O total de números impar: " + totImpar);
	}

}
