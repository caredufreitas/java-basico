package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fat = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Quer ver o fatorial de que número: ");
        int num = scan.nextInt();

        System.out.println(num+ "!");
        for(int i = num - 1; i > 0; i--){
            System.out.print(i+ "x ");
            fat *= i;
            if(i == 1){
                System.out.print("= "+ fat);
            }
        }
	}

}
