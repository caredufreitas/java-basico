package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 0, maior = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite 1 número: ");
		n1 = scan.nextInt();
		System.out.print("Digite 1 número: ");
		n2 = scan.nextInt();

		maior = n1;
		if(n2 > n1){
			maior = n2;
		}
		System.out.println("O maior valor é " + maior);
	}

}
