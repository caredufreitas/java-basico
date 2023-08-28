package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Quer ver a tabuada de que número: ");
        int num = scan.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(num + " X " + i+ " = " + (num * i));
        }
	}

}
