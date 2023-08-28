package br.com.carlosFreitas.interfaceHerancaCastingInstanceOff045;

public class Teste02 {

	public static void main(String[] args) {
		
		Object obj1 = obterString();
		/*
		 * este cast é feito para Object que e mãe de todas as classes do Java
		 */
		String s1 = (String) obj1;
		
		/* adicionando cast String não da erro nenhum na execusaõ 
		 * o metodo obterString está retornando uma String não tem erro de
		 * compilacao e erro de execução.
		 * dowcasting com sucesso.
		 * Chamada de método funciona está retornando uma String 
		 * */
		Object obj02 = "minha String";
		String ob = (String) obj02;
		/*
		 * está referênciando String diretamente 
		 */
		
//		instanciando a super classe java
		Object obj03 = new Object();
//		String o = (String) obj03;
//		vai dar erro em tempo de execução pois esta referenciando um objeto
		
		Object obj04 = obterInteiro();
//		String s4 = (String) obj04;
//		erro em tempo de execução obj04 inteiro não tem nada ver com string
	}
	
	public static String obterString() {
		return "minha String";
	}
	public static int obterInteiro() {
		return 1;
	}
}
