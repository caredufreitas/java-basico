package br.com.carlosFreitas.exercicios.aula013;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Digite a medida da BASE: ");
        String b = scan.nextLine();
        Double base = Double.parseDouble(b);
        double area = Math.pow(base, 2);

        System.out.println("Área: " + area);
	}

}
