package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o dia da semana EX:[1 à 7]: ");
		int d = scan.nextInt();
		System.out.println("Dia digitado: " + d);
		switch (d){
		case 1:
			System.out.println("Domingo ");
			break;
		case 2:
			System.out.println("Segunda-Feira ");
			break;
		case 3:
			System.out.println("Terça-Feira ");
			break;
		case 4:
			System.out.println("Quinta-Feira ");
			break;
		case 5:
			System.out.println("Sexta-Feira ");
			break;
		case 6:
			System.out.println("Sabádo ");
			break;
		default:
			System.out.println("Valor inválido! ");

		}
	}

}
