package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class LetraDigitada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Digite F para Femenio ou M para Masculino: ");
        String s = new String(scan.next().toUpperCase().trim());
        // pool de strings.o conte�do da vari�vel � uma refer�ncia pra um objeto na mem�ria

        if (s.equals("F")){
            System.out.println("Sexo Feminino! ");
        }else if (s.equals("M")){
            System.out.println("Sexo Masculino! ");
        }else {
            System.out.println("Sexo Inv�lido! ");
        }
	}

}
