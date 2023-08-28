package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class IntervaloEntreNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Digite o inicio: ");
        int inicio = scan.nextInt();
        System.out.print("Digite o fim: ");
        int fim = scan.nextInt();
        for(int i = inicio; i < fim + 1; i++){
            System.out.print(i + ", ");
        }
	}

}
