package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class ValorValido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// while tem que ser expressao booleana
		while(true){
			System.out.print("Entre com uma nota de [0 à 10]: ");
			int nota = scan.nextInt();
			if(nota >= 0 && nota <= 10) {
				System.out.println("Você digitou a nota: " + nota);
				break;
			}
		}
		System.out.println("Fim. ");
	}

}
