package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class VogalConsoante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		String l = new String(scan.next().toLowerCase().trim());
		if(l.equals("a") || l.equals("e") || l.equals("i") || l.equals("i") || l.equals("o") || l.equals("u")){
			System.out.println(l + " é Vogal. ");
		}else {
			System.out.println(l + " é Consoante. ");
		}
	}

}
