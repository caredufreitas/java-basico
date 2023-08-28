package br.com.carlosFreitas.exercicios.aula034;

public class ConversaoUnidadeTempo {
	//  minuto
	public static int minito(int segundos){
		return segundos * 60;
	}
	//  hora
	public static int hora(int minutos){
		return minutos * 60;
	}
	//  dia
	public static int dia(int dia){
		return dia * 24;
	}
	//  semana
	public static int semana(int semana){
		return semana * 7;
	}
	//  mes
	public static int mes(int mes){
		return mes * 30;
	}
	//  ano
	public static int ano(int ano){
		return ano * 365;
	}
}
