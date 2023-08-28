package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class LoopNumeroMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 0;
        int soma = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 6; i++){
            System.out.print("Digite o "+ i+ "º número: ");
            int n = scan.nextInt();
            soma += n;
            media = soma / i;
        }
        System.out.println("A média entre os números digitado foi: "+ media);
	}

}
