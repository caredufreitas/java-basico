package br.com.carlosFreitas.exercicios.aula013;

import java.util.Scanner;

public class NumeroInformado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        System.out.println("O número informado foi: " + num);
	}

}
