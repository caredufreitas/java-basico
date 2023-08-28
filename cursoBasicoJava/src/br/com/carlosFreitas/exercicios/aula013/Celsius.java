package br.com.carlosFreitas.exercicios.aula013;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##"); // formatar casas decimais

        System.out.print("Digite a temperatura em Fahrenheit: ");
        String f = scan.nextLine();
        Double farenheit = Double.parseDouble(f);
        double c = (5 * (farenheit - 32) / 9);

        System.out.println("===================================");
        System.out.println(f + "º Fahrenheit.");
        System.out.println(format.format(c) + "º Celsius");
	}

}
