package br.com.carlosFreitas.exercicios.aula013;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SomaInteiroReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.println("Digite 2 número inteiro: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.print("Digite 1 número Real: ");
        String r = scan.next();
        Double real = Double.parseDouble(r);

        double dobro = n1 * 2;
        double metade = n2 / 2;
        double triplo = n1 * 3;

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Números inteiros: " + n1 + ", " + n2);
        System.out.println("Número real: " + r);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + (dobro + metade));
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + (triplo + real));
        System.out.println("O terceiro elevedo ao Cubo é: " + Math.pow(real, 3));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}
