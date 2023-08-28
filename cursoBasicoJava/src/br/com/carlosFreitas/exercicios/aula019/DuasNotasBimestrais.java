package br.com.carlosFreitas.exercicios.aula019;

import java.util.Scanner;

public class DuasNotasBimestrais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double[] nota01 = new double[10];
		double[] nota02 = new double[10];
		double[] result = new double[10];

		for (int i = 0; i < nota01.length; i++){
			int cont = 2;
			System.out.println("============= ("+ (i + 1)+ "ª) =============");
			System.out.print("Digite a nota do aluno: ");
			String n1 = scan.next();
			nota01[i] = Double.parseDouble(n1);
			System.out.print("Digite a outra nota do aluno: ");
			String n2 = scan.next();
			nota02[i] = Double.parseDouble(n2);
			System.out.println("================================");
			result[i] = nota01[i] + nota02[i] / cont;
			cont = 0;
		}
		System.out.println("=================Saída====================");
		for (int i = 0; i < result.length; i++){
			System.out.println((i + 1)+ "º Aluno média: "+ String.format("%.2f", result[i]).replace(",", "."));
		}
		System.out.println("==========================================");
	}

}
