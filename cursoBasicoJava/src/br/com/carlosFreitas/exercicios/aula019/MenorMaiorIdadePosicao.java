package br.com.carlosFreitas.exercicios.aula019;

import java.util.Scanner;

public class MenorMaiorIdadePosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int menor = 0, maior = 0;

		for (int i = 0; i < idades.length; i++){
			System.out.print("digite a " + (i + 1)+ " idade: ");
			idades[i] = scan.nextInt();
			if(i == 0){ // não esquecer de acrescentar ao primeiro loop
				maior = idades[i];
				menor = idades[i];
			}else{
				if(idades[i] > maior){
					maior = idades[i];
				}
				if(idades[i] < menor){
					menor = idades[i];
				}
			}
		}
		System.out.println("A maior idade digitada foi " + maior);
		System.out.println("A menor idade digitada foi " + menor);
	}

}
