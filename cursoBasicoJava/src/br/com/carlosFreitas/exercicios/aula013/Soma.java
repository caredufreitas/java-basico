package br.com.carlosFreitas.exercicios.aula013;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();
        System.out.println("A soma de " + n1 + " + " + n2 + " = " + (n1 + n2));
	}

}
