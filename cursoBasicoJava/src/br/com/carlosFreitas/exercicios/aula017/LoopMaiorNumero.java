package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class LoopMaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int maior = 0;
        for (int i = 1; i < 6; i++){
            System.out.print("Digite o "+ i+ "� n�mero: " );
            int n = scan.nextInt();
            maior = n;
            if(n > maior){
                maior = n;
            }
        }
        System.out.println("O maior n�mero digitado foi: "+ maior);
	}

}
