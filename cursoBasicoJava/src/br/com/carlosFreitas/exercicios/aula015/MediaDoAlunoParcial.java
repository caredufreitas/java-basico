package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class MediaDoAlunoParcial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a 1ª nota do aluno: ");
		String n1 = new String(scan.next());
		Double nota01 = Double.parseDouble(n1);
		System.out.print("Digite a 2ª nota do aluno: ");
		String n2 = new String(scan.next());
		Double nota2 = Double.parseDouble(n2);

		//	        saida
		double media = (nota01 + nota01) / 2;
		System.out.println("Média: " + media);

		if(media >= 9.0 && media <= 10.0){
			System.out.println("Nota: A\nAprovado.");
		}else if(media >= 7.5 && media < 9.0){
			System.out.println("Nota: B\nAprovado");
		}else if(media >= 6.0 && media < 7.5){
			System.out.println("Nota: C\nAprovado");
		}else if(media >= 4.0 && media < 6.0){
			System.out.println("Nota: D\nReprovado");
		}else if(media < 4.0 && media == 0.0){
			System.out.println("Nota: E\nReprovado");
		}
	}

}
