package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scan.nextInt();

        System.out.println("Ano digitado: " + ano);
        if( (ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println("Bissexto! ");
        }else{
            System.out.println("Não é Bissexto! ");
        }
	}

}
