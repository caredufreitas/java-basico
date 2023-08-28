package br.com.carlosFreitas.interfaceHerancaCastingInstanceOff045;

public class Teste02 {

	public static void main(String[] args) {
		
		Object obj1 = obterString();
		/*
		 * este cast � feito para Object que e m�e de todas as classes do Java
		 */
		String s1 = (String) obj1;
		
		/* adicionando cast String n�o da erro nenhum na execusa� 
		 * o metodo obterString est� retornando uma String n�o tem erro de
		 * compilacao e erro de execu��o.
		 * dowcasting com sucesso.
		 * Chamada de m�todo funciona est� retornando uma String 
		 * */
		Object obj02 = "minha String";
		String ob = (String) obj02;
		/*
		 * est� refer�nciando String diretamente 
		 */
		
//		instanciando a super classe java
		Object obj03 = new Object();
//		String o = (String) obj03;
//		vai dar erro em tempo de execu��o pois esta referenciando um objeto
		
		Object obj04 = obterInteiro();
//		String s4 = (String) obj04;
//		erro em tempo de execu��o obj04 inteiro n�o tem nada ver com string
	}
	
	public static String obterString() {
		return "minha String";
	}
	public static int obterInteiro() {
		return 1;
	}
}
