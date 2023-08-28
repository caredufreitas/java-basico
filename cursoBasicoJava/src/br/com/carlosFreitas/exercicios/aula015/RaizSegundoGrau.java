package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class RaizSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de a: ");
		double a = scan.nextDouble();
		System.out.println("Digite o valor de b: ");
		double b = scan.nextDouble();
		System.out.println("Digite o valor de c: ");
		double c = scan.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;
		if(delta < 0){
			System.out.println("Delta: " + delta);
			System.out.println("Não existe raizes reais. ");
		}else{
			if(delta == 0){
				double x1 = -(b) / (2 * a);
				System.out.println("x¹ = x² = " + String.format("%.2f", x1));
			}else {
				double x1 = (- b - Math.sqrt(delta)) / (2 * a);
				double x2 = (- b - Math.sqrt(delta)) / (2 * a);
				System.out.println("x¹ = " + String.format("%.2f" + x1));
				System.out.println("x² = " + String.format("%.2f", x2));
			}
		}
	}

}
