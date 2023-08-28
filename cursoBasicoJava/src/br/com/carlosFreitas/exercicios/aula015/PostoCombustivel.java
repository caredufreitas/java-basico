package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double GASOLINA = 4.833;
		final double ALCOOL = 3.311;
		int l = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Álcool ou Gasolina ");
		String resp = new String(scan.nextLine().toUpperCase().trim().substring(0, 1));

		if(resp.equals("A")){
			System.out.print("Quantos litros? ");
			l = scan.nextInt();
			if(l <= 20){
				double total = ALCOOL * l;
				double desc = total - (total * 3) / 100;
				System.out.println("Total a pagar R$: " + String.format("%.2f", desc));
			}else{
				double total = ALCOOL * l;
				double desc = total - (total * 5) / 100;
				System.out.println("Total a pagar R$: " + String.format("%.2f", desc));
			}
		}
		if(resp.equals("G")){
			System.out.print("Quantos litros? ");
			l = scan.nextInt();
			if(l <= 20){
				double total = GASOLINA * l;
				double desc = total - (total * 4) / 100;
				System.out.println("Total a pagar R$: " + String.format("%.2f", desc));
			}else{
				double total = GASOLINA * l;
				double desc = total - (total * 6) / 100;
				System.out.println("Total a pagar R$: " + String.format("%.2f", desc));
			}
		}
	}

}
