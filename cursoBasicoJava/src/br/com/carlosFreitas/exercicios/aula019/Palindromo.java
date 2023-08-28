package br.com.carlosFreitas.exercicios.aula019;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] a = new String[10];
		String[] reverse = new String[10];
		int fim = a.length - 1, resp = 0;

		for (int i = 0; i < a.length; i++){
			System.out.print("Entre com "+ (i + 1)+ "ª número: ");
			a[i] = scan.next().toLowerCase().strip();
		}
		for (int j = 0; j < a.length; j++){
			reverse[j] = a[fim];
			resp = a[j].compareTo(reverse[j]);
			fim--;
		}
		for (String vetA: a) {
			System.out.print(vetA + " ");
		}
		System.out.println();
		for (String rev: reverse) {
			System.out.print(rev + " ");
		}
		if(resp == 0){
			System.out.println("\nTemos um palíndormo! ");
		}else{
			System.out.println("\nNão temos um palíndormo! ");
		}
	}

}
