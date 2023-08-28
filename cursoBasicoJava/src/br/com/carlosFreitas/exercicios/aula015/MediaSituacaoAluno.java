package br.com.carlosFreitas.exercicios.aula015;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaSituacaoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.##");

		System.out.print("Digite 1º nota do Aluno: ");
		String n1 = scan.next();
		System.out.print("Digite a 2º nota do Aluno: ");
		String n2 = scan.next();
		Double nota1 = Double.parseDouble(n1);
		Double nota2 = Double.parseDouble(n2);
		double media = (nota1 + nota2) / 2;

		System.out.println("Média: " + format.format(media));
	}

}
