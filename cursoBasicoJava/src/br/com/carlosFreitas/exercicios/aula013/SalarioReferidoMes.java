package br.com.carlosFreitas.exercicios.aula013;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioReferidoMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int RENDA = 11;
        final int INSS = 8;
        final int SINDICATO = 5;
        final int DESCOTO_TOTAL = RENDA + INSS + SINDICATO;

        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.print("Quanto voçê ganha por hora R$: ");
        String gh = scan.next();
        System.out.print("Número de horas trabalhadas: ");
        String ht = scan.next();

        Double ganhoHora = Double.parseDouble(gh);
        Double horaTrabalhada = Double.parseDouble(ht);
        double salario = ganhoHora * horaTrabalhada;
        double dscTotal = salario - (salario * DESCOTO_TOTAL) / 100;
        double dscInss = (salario * INSS) / 100;
        double dscSindicato = (salario + SINDICATO) / 100;

        System.out.println("========================================================================================");
        System.out.println("Ganho por hora R$: " + gh);
        System.out.println("Horas trabalhada: " + ht);
        System.out.println("Base Salárial R$: " + salario);
        System.out.println("Total pago ao INSS R$: " + format.format(dscInss));
        System.out.println("Total pago ao Sindicato R$: " + format.format(dscSindicato));
        System.out.println("Total Líquido R$: " + format.format(dscTotal));
	}

}
