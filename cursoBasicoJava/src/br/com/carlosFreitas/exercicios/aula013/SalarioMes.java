package br.com.carlosFreitas.exercicios.aula013;

import java.util.Scanner;

public class SalarioMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora R$: ");
        String gh = scan.nextLine();
        System.out.print("Quantas horas trabalha por mês: ");
        String ht = scan.nextLine();

        Double gHora = Double.parseDouble(gh);
        Double hTrabalhada = Double.parseDouble(ht);
        double total = gHora * hTrabalhada;

        System.out.println("============================================");
        System.out.println("Valor ganho por hora R$: " + gh);
        System.out.println("O total de horas trabalhada por mês: " + ht);
        System.out.println("Voçê ganha o total de R$: " + total);
	}

}
