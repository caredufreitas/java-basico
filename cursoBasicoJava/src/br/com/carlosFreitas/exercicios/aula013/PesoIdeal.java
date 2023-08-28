package br.com.carlosFreitas.exercicios.aula013;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double FORMULA = 72.7;
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.print("Digite sua altura: ");
        String a = scan.next();
        Double altura = Double.parseDouble(a);
        double pi = (FORMULA * altura) - 58;

        System.out.println("Peso ideal: " + format.format(pi));
	}

}
