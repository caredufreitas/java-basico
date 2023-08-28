package br.com.carlosFreitas.variaveisMetodosEstaticos034;

public class TesteCalculadora {

	static int resultadoSoma;
	//	    assim eu consigo acessar esta variavel

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *metodo main é um método estático e não precisa de uma instância desta classe aqui.
		 *No caso sem metodo modificador static
		 * MinhaCalculadora calc = new MinhaCalculadora();
		 * teriamos que instânciar a classe para usar os métodos.
		 *MinhaCalculador.class(), retorna nada mais que o tipo da classe.
		 *
		 * */
		//        com modificador static
		System.out.println("Classe MinhaCalculadora. ");
		resultadoSoma = MinhaCalculadora.soma(1, 2);
		System.out.println(resultadoSoma);
		System.out.println("Classe TesteCalculadora. ");
		System.out.println(somaValores(3, 2));
	}
	static int somaValores(int num1, int num2){
		return MinhaCalculadora.soma(num1, num2);
	}
	/*
	 * Fazer a chamada do método da classe, pelo metodo statico desta classe
	 * */
}
