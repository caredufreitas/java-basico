package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int potencia = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int b = scan.nextInt();
        System.out.print("Digite o expoente: ");
        int e = scan.nextInt();

        for (int i = 0; i < e; i++){
            potencia = b * b;
        }
        System.out.println(b+ " (exp) "+ e+ " = "+ potencia);
	}

}
