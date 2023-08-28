package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class LoopMaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int maior = 0;
        for (int i = 1; i < 6; i++){
            System.out.print("Digite o "+ i+ "º número: " );
            int n = scan.nextInt();
            maior = n;
            if(n > maior){
                maior = n;
            }
        }
        System.out.println("O maior número digitado foi: "+ maior);
	}

}
