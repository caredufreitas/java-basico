package br.com.carlosFreitas.exercicios.aula017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 0, soma = 0;
        int i = 1;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        while (true){
            System.out.print("Digite a "+ i+ "º nota: ");
            String n = new String(scan.next().trim());
            Double nota = Double.parseDouble(n);
            soma += nota;
            System.out.print("Quer continuar [S/N]: ");
            String resp = new String(scan.next().toUpperCase().trim().substring(0, 1));
            if(resp.equals("N")){
                break;
            }
            i++;
        }
        media = soma / i;
        System.out.println("Foram "+ i+ " números digitados. ");
        System.out.println("Soma das notas: "+ soma);
        System.out.printf("A média é : "+ df.format(media).replace(',', '.'));
	}

}
