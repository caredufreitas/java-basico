package br.com.carlosFreitas.exeptionsTryCatch047;

public class Excecao {

	public static void main(String[] args) {
		int[] vetor = new int[4];
		
		try {
			System.out.println("Antes da exception. ");
			vetor[4] = 1;
			System.out.println("Este texto n�o ser� impresso. ");
		} catch (ArrayIndexOutOfBoundsException excessacao) { // pegar o nome da excessao lancada
			System.out.println("Excecao ao acessar um �ndice do vetor que n�o existe. "
					+ excessacao.getMessage()); // capturou e tratou a exception
		}
		System.out.println("Este texto ser� impresso depois do tratamento de erro. ");
		
	}
}
