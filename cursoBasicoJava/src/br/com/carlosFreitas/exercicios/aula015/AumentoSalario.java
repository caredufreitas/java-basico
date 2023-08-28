package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        double nSalario = 0, totAumento = 0;
        int percentual = 0;

        System.out.print("Digite o valor de seu salário R$: ");
        String s = new String(scan.next());
        Double salario = Double.parseDouble(s);

        System.out.println("O salário digitado foi R$: " + String.format("%.2f", salario));

        if (salario <= 280.0){
            percentual = 20;
            nSalario = salario + (salario * 20) / 100;
            totAumento = (salario * 20) / 100;
        }else if(salario > 280.0 && salario <= 700.0){
            percentual = 15;
            nSalario = salario + (salario * 15) / 100;
            totAumento = (salario * 20) / 100;
        }else if(salario > 700.0 && salario <= 1500.0){
            percentual = 10;
            nSalario = salario + (salario * 10) / 100;
            totAumento = (salario * 20) / 100;
        }else {
            percentual = 5;
            nSalario = salario + (salario * 5) / 100;
            totAumento = (salario * 20) / 100;
        }
//        saida
        System.out.println("++++++++++++++++++++++++++++SAÍDA++++++++++++++++++++++++++++++");
        System.out.println("Foram aplicados " + percentual +  "% de aumento no salário. ");
        System.out.println("Acrecentou-se o valor de R$: " + String.format("%.2f", totAumento));
        System.out.println("Seu novo salario R$: " + String.format("%.2f", nSalario));
        System.out.println("+++++++++++++++++++++++++++++FIM+++++++++++++++++++++++++++++++" +
                "");
	}

}
