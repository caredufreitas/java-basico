package br.com.carlosFreitas.exercicios.aula013;

import java.util.Scanner;

public class Centimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valore em Metros(Mtr): ");
        String m = scan.nextLine();
        Double mtr = Double.parseDouble(m); // conversão para double.
        double cm = mtr / 100; // é dividido em 100 partes iguais
        System.out.println("O valor em Metros digitado foi: " + mtr);
        System.out.println("Equivale: " + cm + " cm");
	}

}
