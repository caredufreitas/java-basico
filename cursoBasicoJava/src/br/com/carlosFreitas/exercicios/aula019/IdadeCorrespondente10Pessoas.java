package br.com.carlosFreitas.exercicios.aula019;

import java.util.Scanner;

public class IdadeCorrespondente10Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int superior35 = 0;

		for (int i = 0; i < idades.length; i++){
			System.out.print("Digite a " + (i + 1)+ "ª idade? ");
			idades[i] = scan.nextInt();
			if(idades[i] > 35){
				superior35++;
			}
		}
		System.out.println("\nForam " + superior35+ " idades digitadas superiores a 35 anos. ");
	}

}
