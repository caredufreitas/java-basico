package br.com.carlosFreitas.ExceptionsStackTraceThrows050;

public class ExceptionGenerica {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try { // n�o tem a necessidade de coloca o tratamento da excessao fora do for pois esta linha esta dando erro
				System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
			} catch (Exception e) {
				System.out.println(e.getMessage()); // ainda n�o � muito �til.
				e.printStackTrace(); // algo melhor para o desenvolvedor mostrando a linha.
				/* em prjetos reais � colocado em log, e n�o tendo como 
				 * log4j, bibliotecas para criar arquivo de log.
				 * em produ��o olhamos o log
				 * */
			} 
		}
	}

}
