package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int n = scan.nextInt();

		System.out.println("N�mero digitado: " + n);
		if(n % 2 == 0){
			System.out.println("Par ");
		}else {
			System.out.println("Impar ");
		}
	}

}
