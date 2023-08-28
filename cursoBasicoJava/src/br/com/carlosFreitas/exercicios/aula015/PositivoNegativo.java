package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int v = scan.nextInt();
		if(v < 0){
			System.out.println("O valor " + v + " é Negativo");
		}else{
			System.out.println("O valor " + v + " é Positivo");
		}
	}

}
