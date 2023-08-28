package br.com.carlosFreitas.exercicios.aula035;

public class Recursividade {
	//  enésimoTermoDeFibonacci
	public static int fibonacci(int num){
		if(num < 2){
			return 1;
		}
		return fibonacci(num - 1) + fibonacci(num - 2); //aqui ele faz a soma entre os valores
	}
	//  somatorioDosNumeros
	public static int somar(int num){
		if(num == 0){
			return 0; //somatoria de 0 é 0
		}
		return somar(num - 1 ) + num;
	}
	/*
	 * a chamada recursiva de meu parametro num - 1
	 * somar(5) = somar(4) + 5 = 10 + (5) = 15
	 * somar(4) = somar(3) + 4 = 6 + (4) = 10
	 * somar(3) = somar(2) + 3 = 3 + (3) = 6
	 * somar(2) = somar(1) + 2 = 1 + (2) = 3
	 * somar(1) = somar(0) + 1 = 0 + (1) = 1
	 * somar(0) + 0, somatoria de 0 = 0
	 * Assim que acontece o valor vem auto mas ele reverte a forma da soma
	 * Coloca na pilha de depois desempilha fazendo operação.
	 * inicialmente do somatorio de 0 mais o valor acima 1.
	 * sucessivamente para n positivo.
	 * */
}
