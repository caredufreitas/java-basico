package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class Crime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int pontuacao = 0;

		System.out.print("Telefonou para vitima? ");
		String t = new String(scan.nextLine().toUpperCase().trim().substring(0, 1));
		System.out.print("Esteve no local do crime? ");
		String l = new String(scan.nextLine().toUpperCase().trim().substring(0, 1));
		System.out.print("Mora perto da vitima? ");
		String m = new String(scan.nextLine()).toUpperCase().trim().substring(0, 1);
		System.out.print("Devia para vitima? ");
		String d = new String(scan.nextLine().toUpperCase().trim().substring(0, 1));
		System.out.print("Já trabalhou com a vitima? ");
		String tv = new String(scan.nextLine().toUpperCase().trim().substring(0, 1));

		if(t.equals("S")){
			pontuacao++;
		}else{
			pontuacao--;
		}
		if(l.equals("S")){
			pontuacao++;
		}else{
			pontuacao--;
		}
		if(m.equals("S")){
			pontuacao++;
		}else{
			pontuacao--;
		}
		if(d.equals("S")){
			pontuacao++;
		}else{
			pontuacao--;
		}
		if(tv.equals("S")){
			pontuacao++;
		}else{
			pontuacao--;
		}

		switch (pontuacao){
		case 1:
		case 2:
			System.out.println("Voçê é Suspeita. ");
			break;
		case 3:
		case 4:
			System.out.println("Voçê é Cumplice. ");
			break;
		case 5:
			System.out.println("Voçê é Assasino. ");
			break;
		default:
			System.out.println("Voçê é Inocente. ");

		}
	}

}
