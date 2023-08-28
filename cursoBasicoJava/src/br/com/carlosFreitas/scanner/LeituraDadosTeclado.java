package br.com.carlosFreitas.scanner;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		//      System.out.print("Digite seu nome completo: ");
		//      String nome = scan.nextLine(); // lê a linha inteira
		//      System.out.println("Digite o seu primeiro nome: ");
		//      String firstName = scan.next(); // somente ate o primeiro espaço
		//      System.out.println("Digite sua idade: ");
		//      int idade = scan.nextInt();
		//      System.out.println("Digite sua altura: ");
		//      double altura = scan.nextDouble();
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se contém pet de estimação?");
		String nome = scan.next();
		double idade = scan.nextDouble();
		int qtdFilhos = scan.nextInt();
		float altura = scan.nextFloat();
		boolean pet = scan.nextBoolean();
		//      saida
		//      System.out.println("Seu nome completo é: " + nome);
		//      System.out.println("Digite o seu primeiro nome: " + firstName);
		//      System.out.println("Sua idade é: " + idade);
		//      System.out.println("Sua altura é: " + altura);
		System.out.println("Prazer, " + nome + ", você tem " + idade +
				" de idade, cotém " + qtdFilhos + ", sua altura é " + altura +
				", e " + pet + " pets em casa.");
	}

}
