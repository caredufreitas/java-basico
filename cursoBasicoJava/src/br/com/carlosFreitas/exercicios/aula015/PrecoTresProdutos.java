package br.com.carlosFreitas.exercicios.aula015;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrecoTresProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.##");

		System.out.print("Digite o valor do 1� produto R$: ");
		String p1 = scan.next();
		System.out.print("Digite o valor do 2� produto R$: ");
		String p2 = scan.next();
		System.out.print("Digite o valor do 3� produto R$: ");
		String p3 = scan.next();
		Double produto01 = Double.parseDouble(p1);
		Double produto02 = Double.parseDouble(p2);
		Double produto03 = Double.parseDouble(p3);

		double menor = produto01;
		if(produto02 < produto01){
			menor = produto02;
		}else if(produto03 < produto01){
			menor = produto03;
		}
		System.out.println("O menor pre�o R$: " + format.format(menor) + ", este que vai comprar! ");
	}

}
