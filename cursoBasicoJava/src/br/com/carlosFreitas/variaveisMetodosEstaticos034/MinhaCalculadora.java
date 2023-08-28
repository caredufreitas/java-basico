package br.com.carlosFreitas.variaveisMetodosEstaticos034;

public class MinhaCalculadora {
	//  polimorfismo em tempo de compila��o
	public static int soma(int num1, int num2){
		return num1 + num2;
	}
	//  modificando somente o tipo primitivo da assinatura
	public static double soma(double num1, double num2){
		return num1 + num2;
	}

	public static int soma(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}

	public static int soma(int[] vetorInteiros){
		int total = 0;
		for (int i = 0; i < vetorInteiros.length; i++){
			total += vetorInteiros[i];
		}
		return total;
	}
	/*
	 * No java este recurso � chamado de classes utilit�rias, podemos declarar
	 * n�o � muito orientado a objetos quebra um pouco a orienta��o objetos, m�s
	 * mesmo assim � um recurso que a l�nguagem java tem.
	 *
	 * */
}
