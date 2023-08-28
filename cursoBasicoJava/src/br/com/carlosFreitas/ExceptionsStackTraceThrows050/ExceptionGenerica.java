package br.com.carlosFreitas.ExceptionsStackTraceThrows050;

public class ExceptionGenerica {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try { // não tem a necessidade de coloca o tratamento da excessao fora do for pois esta linha esta dando erro
				System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
			} catch (Exception e) {
				System.out.println(e.getMessage()); // ainda não é muito útil.
				e.printStackTrace(); // algo melhor para o desenvolvedor mostrando a linha.
				/* em prjetos reais é colocado em log, e não tendo como 
				 * log4j, bibliotecas para criar arquivo de log.
				 * em produção olhamos o log
				 * */
			} 
		}
	}

}
