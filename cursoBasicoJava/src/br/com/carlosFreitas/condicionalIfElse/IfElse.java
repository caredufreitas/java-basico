package br.com.carlosFreitas.condicionalIfElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scan = new Scanner(System.in);
//	        System.out.print("Digite sua idade: ");
//	        int idade = scan.nextInt();
	//
//	        System.out.println("Idade: " + idade);
//	        if (idade >= 18) {
//	            System.out.println("É maior de idade. ");
//	        }else {
//	            System.out.println("Não é maior de idade. ");
//	        }
	// barato <= 10
	// 10 < valor < 15 - pedir desconto
	// 10 <= valor 17 - pesquisar mais
	// >= 17 - muito caro
	        System.out.print("Entre com o preco do Item R$: ");
	        int item = scan.nextInt();
	        if (item <= 10){
	            System.out.println("Barato! ");
	        }else if( (item > 10) && (item <= 17) ){
	            System.out.println("Pesquisar Mais! ");
	        }else if(item > 17){
	            System.out.println("Muito Caro! ");
	        }
	        System.out.println("Fim. ");
	    }

}
