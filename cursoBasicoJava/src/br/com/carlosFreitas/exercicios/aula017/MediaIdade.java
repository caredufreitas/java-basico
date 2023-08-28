package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class MediaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 0;
        int i = 1, soma = 0;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Digite a "+ i+"ª idade: ");
            int idade = scan.nextInt();
            soma += idade;
            System.out.print("Continuar [S/N]: ");
            String resp = new String(scan.next().toUpperCase().trim().substring(0, 1));
            if(resp.equals("N")){
                break;
            }
            i++;
        }
        media = Math.round(soma / i);
        System.out.println("Média da turma: "+ media);
        if(media <= 25){
            System.out.println("A turma é Jovem. ");
        }else if(media >= 26 && media <= 60){
            System.out.println("A turma é Adulta. ");
        }else{
            System.out.println("A turma é Velha. ");
        }
	}

}
