package br.com.carlosFreitas.exercicios.aula017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PopulacaoPaisInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        while (true){
            System.out.print("Digite a quantidade da População A: ");
            Long a = scan.nextLong();
            System.out.print("Digite a quantidade da População B: ");
            Long b = scan.nextLong();

            double crecimentoA = (a * 3) / 100;
            double crescimentoB = (b * 1.5) / 100;
            double diferenca = 0;
            String f1 = " ";
            String f2 = " ";
            if(crecimentoA > crescimentoB){
                diferenca = crecimentoA - crescimentoB;
                f1 = "A";
                f2 = "B";
            }else{
                diferenca = crescimentoB - crecimentoA;
                f1 = "B";
                f2 = "A";
            }
            int total = (int) diferenca / 12;
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Crecimento de A: " + df.format(crecimentoA));
            System.out.println("Crescimento de B: " + df.format(crescimentoB));
            System.out.println("A diferenca entre " + f1+ " e " + f2+ " é de " + diferenca);
            System.out.println("A população " + f1+ " vai levar " + total+ " anos para alcaçar a população " + f2);
            System.out.print("Deseja continuar [S/N]: ");
            String resp = new String(scan.next().toUpperCase().trim().substring(0, 1));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            if(resp.equals("N")){
                break;
            }
        }
        System.out.println("Fim. ");
	}

}
