package br.com.carlosFreitas.exercicios.aula47a52;

public class AgendaCheiaException extends Exception{

//	ctrl + space abre os metodos da classe Exception
	@Override
	public String getMessage() {
		return "Agenda já está cheia. ";
	}
}
