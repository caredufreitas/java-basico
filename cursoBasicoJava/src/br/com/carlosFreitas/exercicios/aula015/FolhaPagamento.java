package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SINDICATO = 3;
		final int FGTS = 11;
		final int INSS = 10;

		double novoSal = 0, ir = 0, inss = 0, fgts = 0, total = 0;
		int valor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto você recebe por hora? ");
		String h = new String(scan.next());
		Double hr = Double.parseDouble(h);
		System.out.print("Qual a quantidade de horas trabalhadas no mês? ");
		int ht = scan.nextInt();

		double salarioBruto = ht * hr;
		System.out.println("Salário Bruto R$: " + String.format("%.2f", salarioBruto));
		if (salarioBruto <= 900.0){
			novoSal = salarioBruto;
		}else if(salarioBruto > 900.0 && salarioBruto <= 1500.0){
			valor = 5;
			ir = (salarioBruto * 5) / 100;
			inss = (salarioBruto * INSS) / 100;
			fgts = (salarioBruto * FGTS) / 100;
			total = ir + inss;
			double desc = valor + INSS;
			novoSal = salarioBruto - (salarioBruto * desc) / 100;
		}
		//        saida
		System.out.println("++++++++++++++++++++FOLHA PAGAMENTO++++++++++++++++++++");
		System.out.println("(-) IR (" + valor + "%) R$: " + String.format("%.2f", ir));
		System.out.println("(-) INSS (" + INSS + "%) R$: " + String.format("%.2f", inss));
		System.out.println("(-) FGTS (" + FGTS + "%) R$: " + String.format("%.2f", fgts));
		System.out.println("Total de descontos R$: " + String.format("%.2f", total));
		System.out.println("Salário Líquido R$: " + String.format("%.2f", novoSal));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}
