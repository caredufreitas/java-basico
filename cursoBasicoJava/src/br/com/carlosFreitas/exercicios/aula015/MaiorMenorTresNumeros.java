package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class MaiorMenorTresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o 1� n�mero: ");
		int n1 = scan.nextInt();;
		System.out.print("Digite o 2� n�mero: ");
		int n2 = scan.nextInt();
		System.out.print("Digite o 2� n�mero: ");
		int n3 = scan.nextInt();

		int maior = n1;
		if (n2 > n1){
			maior = n2;
		}else if (n3 > n1){
			maior = n3;
		}
		int menor = n1;
		if(n2 < n1){
			menor = n2;
		}else if(n3 < n1){
			menor = n3;
		}

		System.out.println("O maior n�mero foi: " + maior);
		System.out.println("O menor n�mero foi: " + menor);
	}

}
