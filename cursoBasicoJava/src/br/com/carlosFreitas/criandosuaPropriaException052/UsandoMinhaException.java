package br.com.carlosFreitas.criandosuaPropriaException052;

import java.security.DigestException;

public class UsandoMinhaException {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 5, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0 , 2, 3};
		
		/*
		 * estamos tentando dividir inteiro por numero inteiro e nao vai dar numeros
		 * reais vamos lancar nossa excessao para isto.
		 * Sempre que a divisão for para um número impar resultado não serã inteiro
		 */
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				if(numeros[i] % 2 != 0) {
//					lançar exception aqui, local
//					throw new Exception("Número impar, divisão não exata. ");
//					throw new que lança a exception para frente.
					throw new DivisaoNaoExata(numeros[i], denominador[i]);
					
				}
				System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata exc) { // divisao nao exata minha exception
				System.out.println("Erro ao dividir por 0. ");
				exc.printStackTrace();
			}
				/*
				* usado para excessao local
				 * catch (Exception e) { // tem que declarar este catch para sai o erro
				 * System.out.println("Aconteçeu um erro. ");
				 * System.out.println(e.getMessage()); }
				 */
		}
	}

}
