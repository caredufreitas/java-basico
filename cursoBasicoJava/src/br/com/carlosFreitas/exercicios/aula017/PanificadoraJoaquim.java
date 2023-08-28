package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class PanificadoraJoaquim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço do pão R$: ");
        String p = new String(scan.next());
        Double pao = Double.parseDouble(p);
        do {
            double novoPreco = pao * i;
            System.out.println("["+ i+ "]=R$: "+ novoPreco);
            i++;
        }while (i < 51);
	}

}
