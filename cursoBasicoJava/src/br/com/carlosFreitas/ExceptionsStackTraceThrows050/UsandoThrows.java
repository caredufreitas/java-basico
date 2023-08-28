package br.com.carlosFreitas.ExceptionsStackTraceThrows050;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um n�mero decimal: ");
		
		/*
		 * 
		 * a IDE vai reclamar mostrando a op��o de passar a excess�o para frente ou
		 * tratar.
		 * Add throws declarations -> passar ela para frente com throws
		 * Surround with try/catch -> tratar a exception com try catch
		 */ 
			try {
				double num = lerNumero();
				System.out.println("Vo�� digitou " + num);
			} catch (Exception e) {
				System.err.println("Entrada inv�lida. ");
				e.printStackTrace();
			}
		
		
	}
	
// pode acontecer de quando chamar ele dar uma exception.
//	quem for usar este m�todo vai ter que tratar est� exception.
//	static sen�o o m�todo man n�o consegue ver.
	public static double lerNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}
