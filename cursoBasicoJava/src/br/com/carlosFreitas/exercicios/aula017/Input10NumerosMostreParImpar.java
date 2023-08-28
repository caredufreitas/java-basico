package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class Input10NumerosMostreParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par = 0, impar = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 11; i++){
            System.out.print("Digite o "+ i+ "º número: ");
            int n = scan.nextInt();
            if(n % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }

        System.out.println("Quantidade de número par: "+ par);
        System.out.println("Quantidade de número impar: "+ impar);
	}

}
