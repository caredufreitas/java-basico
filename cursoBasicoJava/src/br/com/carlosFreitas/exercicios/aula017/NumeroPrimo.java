package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int cont = 0;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Digite um n�mero: ");
	        int num = scan.nextInt();
	        if(num % num == 0){
	            cont++;
	        }
	        if(cont > 2){
	            System.out.print(num+ " n�o � primo! ");
	        }else{
	            System.out.print(num+ " � primo! ");
	        }
	}

}
