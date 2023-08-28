package br.com.carlosFreitas.exercicios.aula013;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        int n1 = scan.nextInt();
        System.out.print("Digite a segunda nota: ");
        int n2 = scan.nextInt();
        System.out.print("Digite a terceira nota: ");
        int n3 = scan.nextInt();
        System.out.print("Digite a quarta nota: ");
        int n4 = scan.nextInt();
        float media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média é: " + media);
	}

}
