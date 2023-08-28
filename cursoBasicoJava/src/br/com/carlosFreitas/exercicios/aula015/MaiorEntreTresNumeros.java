package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class MaiorEntreTresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 0, v2 = 0, v3 = 0, maior = 0, menor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite 1º valor: ");
		v1 = scan.nextInt();
		System.out.print("Digite o 2º valor: ");
		v2 = scan.nextInt();
		System.out.print("Digite o 3º valor: ");
		v3 = scan.nextInt();

		maior = v1;
		if (v2 > v1){
			maior = v2;
		}else if (v3 > v1){
			maior = v3;
		}
		System.out.println("O maior é " + maior);
	}

}
