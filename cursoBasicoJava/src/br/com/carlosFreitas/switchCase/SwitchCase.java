package br.com.carlosFreitas.switchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);

		System.out.print("Digite o dia da semana(1-7): ");
		int dia = scan.nextInt();
		switch (dia){
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feria");
			break;
		case 5:
			System.out.println("Quinte-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Número não valido! ");
		}
		switch (dia){
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: System.out.println("Dia Útil!"); break;
		case 1:
		case 7: System.out.println("Fim de semana!"); break;
		default: System.out.println("Dia inválido!");

		}
	}

}
