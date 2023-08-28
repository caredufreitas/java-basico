package br.com.carlosFreitas.exercicios.aula013;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.print("Digite a temperatura em Celsius. ");
        String c = scan.nextLine();
        Double celsius = Double.parseDouble(c);
        double f = (celsius * 1.8) + 32;

        System.out.println(c + "º Celsius.");
        System.out.println(format.format(f) + "º Fahrenheit.");
	}

}
