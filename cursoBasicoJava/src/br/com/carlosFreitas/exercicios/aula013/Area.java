package br.com.carlosFreitas.exercicios.aula013;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o Raio de um circulo: ");
		String r = scan.nextLine();
		Double raio = Double.parseDouble(r);
		double area = PI * (Math.pow(raio, 2));

		System.out.println("O Raio digitado foi: " + raio);
		System.out.println("Área: " + area);
	}

}
