package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class TurnoEstudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Em que turno você estuda? \n" +
				"Digite. \n" +
				"[M - Matutino | V - Vespertino | N - Noturno]:");
		String t = new String(scan.nextLine().toUpperCase().trim());

		System.out.println("Turno digitado: " + t);
		if(t.substring(0, 1).equals("M")){
			System.out.println("Bom dia!");
		}else if(t.substring(0, 1).equals("V")){
			System.out.println("Boa tarde! ");
		}else if(t.substring(0, 1).equals("N")){
			System.out.println("Boa Noite! ");
		}
	}

}
