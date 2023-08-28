package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class OrdemDecrecente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o 1� n�mero: ");
		int n1 = scan.nextInt();
		System.out.print("Digite o 2� n�mero: ");
		int n2 = scan.nextInt();
		System.out.print("Digite o 3� n�mero: ");
		int n3 = scan.nextInt();

		if( (n1 < n2) && (n1 < n3) && (n3 < n2)){
			/* 1� possibilidades (n2 < n3) -> aqui esta a chave, porque se o numero 3 � maior que 2 a ordem � 3, 2, 1
			 * n1 menor
			 * n2 � maior
			 * caso n1 < n3 < n2
			 * nom, */
			System.out.print(n2 + "-" + n3 + "_" + n1);
		}else if( (n1 < n2) && (n1 < n3) && (n2 < n3)){
			/*2� possibilidade
            (n3 < n2) => se o numero 2 � maior que 3 e 1 e menor que 1, 3 a ordem � 2, 3, 1
			 * num 1 menor
			 * num 3 maior porque ele nao e menor que n2
			 * num1 < num2 < num3
			 * */
			System.out.print(n3 + "-" + n2 + "-" + n1);
		}else if( (n2 < n1) && (n2 < n3) && (n3 < n1)){
			/* 3� possibilidade
			 * n2 - menor
			 * n1 - maior
			 * n2 < n3 < n1
			 * */
			System.out.print(n1 + "-" + n3 + "-" + n2);
		}else if ( (n2 < n1) && (n2 < n3) && (n3 < n1)){
			/*4� possibilidade
			 * n2 - menor
			 * n1 - maior
			 * n2 < n3 < n1
			 * */
			System.out.print(n1 + "-" + n3 + "-" + n2);
		}else if( (n3 < n1) && (n3 < n2) && (n2 < n1)){
			/*5� possibilidade
			 * n3 - menor
			 * n1 - maior
			 * n3 < n2 < n1
			 * */
			System.out.print(n1 + "-" + n2 + "-" + n3);
		}else if( (n3 < n1) && (n3 < n2) && (n1 < n2)){
			/*
			 * n3 - menor
			 * n2 - maior
			 * n3 < n1 < n2
			 * */
			System.out.print(n2 + "-" + n1 + "-" + n3);
		}
	}

}
