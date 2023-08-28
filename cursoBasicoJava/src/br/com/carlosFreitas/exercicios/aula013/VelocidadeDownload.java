package br.com.carlosFreitas.exercicios.aula013;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VelocidadeDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.print("Entre com o tamanho do arquivo para Download(MB): ");
        String t = scan.next();
        System.out.print("Entre com a velocidade do link de internet(MBP/s): ");
        String v = scan.next();

        Double tamanho = Double.parseDouble(t);
        Double velocidade = Double.parseDouble(v);
        double segundo = tamanho / (velocidade / 8);
        System.out.println(tamanho + " MB. ");
        System.out.println(velocidade + " MBP/s. ");
        System.out.println("Total: " + format.format(segundo) + " segundos. ");
	}

}
