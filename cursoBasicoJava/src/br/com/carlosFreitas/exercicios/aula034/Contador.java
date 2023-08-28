package br.com.carlosFreitas.exercicios.aula034;

public class Contador {
	static int contador;

	public Contador() {
		Contador.contador++;
	}

	public static int acrementar(){
		return Contador.contador++;
	}

	public static int decrementar(){
		return Contador.contador--;
	}

	public static int zerar(){
		return Contador.contador = 0;
	}
}
