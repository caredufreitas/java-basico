package br.com.carlosFreitas.exercicios.aula034;

public class Calculadora {
	//  somar
	public static double somar(double num1, double num2){
		return num1 + num2;
	}
	//  subtrair
	public static double subtrair(double num1, double num2){
		return num1 - num2;
	}
	//  multiplicar
	public static double multiplicar(double num1, double num2){
		return num1 * num2;
	}
	//  dividir
	public static double dividir(double num1, double num2){
		return num1 / num2;
	}
	//  potência
	public static double potencializar(double num1, double num2){
		return Math.pow(num1, num2);
	}
	//  fatorial
	public static void fatorial(int num){
		int c = num;
		int f = 1;
		while (c >= 1){
			System.out.print(f * c + ", ");
			c--;
		}
	}
}
