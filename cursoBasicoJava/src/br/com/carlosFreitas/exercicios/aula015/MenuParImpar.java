package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class MenuParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o 1ª número: ");
		int n1 = scan.nextInt();
		System.out.print("Escolha operacao [1 - Impar ou Par, 2 - Negativo - Positivo]: ");
		int op = scan.nextInt();
		switch (op){
		case 1:
			if(n1 % 2 == 0){
				System.out.println(n1 + " é Par. ");
			}else{
				System.out.println(n1 + " é Impar. ");
			}
			break;
		case 2:
			if(n1 > 0){
				System.out.println(n1 + " é Positivo. ");
			}else{
				System.out.println(n1 + " é Negativo. ");
			}
		}
		System.out.println("Fim");
	}

}
