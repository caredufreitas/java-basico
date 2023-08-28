package br.com.carlosFreitas.exceptionsFinally049;

public class TestandoFinally {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try { // não tem a necessidade de coloca o tratamento da excessao fora do for pois esta linha esta dando erro
				System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
			} catch (ArithmeticException excessao) {
				System.out.println("Erro ao dividir por 0. ");
			} catch (ArrayIndexOutOfBoundsException index) { // multi cactch
				System.out.println("Posição do array inválida. ");
			} finally {
				System.out.println("Linha impressa depois do bloco try e catch. "); 
			}
			/* sempre executado apos o try e sempre executado depois do cactch */
		}
	}

}
