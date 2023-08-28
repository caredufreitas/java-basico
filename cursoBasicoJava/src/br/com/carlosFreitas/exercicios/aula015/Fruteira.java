package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class Fruteira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double morango = 0, maca = 0, totalPagar = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos kilos de Morango: ");
		double m = scan.nextDouble();
		System.out.print("Quantos Kilos de Maça: ");
		double ma = scan.nextDouble();

		if(m < 5){
			morango = 2.5;
		}else{
			morango = 2.2;
		}
		if(ma < 5){
			maca = 1.8;
		}else{
			maca = 1.5;
		}
		double totalKilo = m + ma;
		double valorMorango = totalKilo * morango;
		double valorMaca = totalKilo * maca;
		double somaTotal = valorMorango + valorMaca;

		if(totalKilo > 8.0 || somaTotal > 25.00){
			totalPagar = somaTotal - (somaTotal * 10) / 100;
		}else{
			totalPagar = somaTotal;
		}

		System.out.println(m + " Kilos de Morango. ");
		System.out.println(ma + " Kilos de Maça. ");
		System.out.println("Somando um total de " + totalKilo + " kilos.");
		System.out.println("Preço R$: " + totalPagar);
	}

}
