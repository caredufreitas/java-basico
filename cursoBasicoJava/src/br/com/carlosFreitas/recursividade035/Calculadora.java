package br.com.carlosFreitas.recursividade035;

public class Calculadora {

	//  fatorialNãoRecursivo
	public static int fatorialNaoRecursivo(int num){
		if(num == 0){
			return 1;
		}
		int total = 1;
		for (int i = num; i > 1; i--){
			total *= i;
		}
		return total;
	}
	//  fatorialRecursivo
	public static int fatorial(int num){
		if(num == 0){ // aqui esta o ponto de parada
			return 1;
		}
		return num * fatorial(num - 1);
	}
}
