package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class IntervaloEntreNumeroSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o início: ");
        int inicio = scan.nextInt();
        System.out.print("Digite o fim: ");
        int fim = scan.nextInt();
        for(int i = inicio; i < fim + 1; i++){
            soma += i;
            System.out.print(i+ ", ");
        }
        System.out.println("\nA soma entre eles são: " + soma);
	}

}
