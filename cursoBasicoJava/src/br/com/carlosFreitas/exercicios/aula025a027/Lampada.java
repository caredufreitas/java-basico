package br.com.carlosFreitas.exercicios.aula025a027;

public class Lampada {
	boolean chave;

	String ligar(){
		this.chave = true;
		return "Lampada ligada (" + this.chave+ "). ";
	}

	String desligar(){
		this.chave = true;
		return "Lampada desligada (" + this.chave+ "). ";
	}

}
