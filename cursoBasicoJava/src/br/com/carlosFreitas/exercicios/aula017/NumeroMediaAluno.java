package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class NumeroMediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        double media = 0;
        System.out.print("Quantidade de turma: ");
        int t = scan.nextInt();
        System.out.println("Quantidade de Alunos por turma: ");
        int q = scan.nextInt();

        media = Math.round(t / q);
        System.out.println("Média de Alunos: "+ media);
	}

}
