package br.com.carlosFreitas.scanner;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		//      System.out.print("Digite seu nome completo: ");
		//      String nome = scan.nextLine(); // l� a linha inteira
		//      System.out.println("Digite o seu primeiro nome: ");
		//      String firstName = scan.next(); // somente ate o primeiro espa�o
		//      System.out.println("Digite sua idade: ");
		//      int idade = scan.nextInt();
		//      System.out.println("Digite sua altura: ");
		//      double altura = scan.nextDouble();
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se cont�m pet de estima��o?");
		String nome = scan.next();
		double idade = scan.nextDouble();
		int qtdFilhos = scan.nextInt();
		float altura = scan.nextFloat();
		boolean pet = scan.nextBoolean();
		//      saida
		//      System.out.println("Seu nome completo �: " + nome);
		//      System.out.println("Digite o seu primeiro nome: " + firstName);
		//      System.out.println("Sua idade �: " + idade);
		//      System.out.println("Sua altura �: " + altura);
		System.out.println("Prazer, " + nome + ", voc� tem " + idade +
				" de idade, cot�m " + qtdFilhos + ", sua altura � " + altura +
				", e " + pet + " pets em casa.");
	}

}
