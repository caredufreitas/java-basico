package br.com.carlosFreitas.ExceptionsStackTraceThrows050;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um número decimal: ");
		
		/*
		 * 
		 * a IDE vai reclamar mostrando a opção de passar a excessão para frente ou
		 * tratar.
		 * Add throws declarations -> passar ela para frente com throws
		 * Surround with try/catch -> tratar a exception com try catch
		 */ 
			try {
				double num = lerNumero();
				System.out.println("Voçê digitou " + num);
			} catch (Exception e) {
				System.err.println("Entrada inválida. ");
				e.printStackTrace();
			}
		
		
	}
	
// pode acontecer de quando chamar ele dar uma exception.
//	quem for usar este método vai ter que tratar está exception.
//	static senão o método man não consegue ver.
	public static double lerNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}
