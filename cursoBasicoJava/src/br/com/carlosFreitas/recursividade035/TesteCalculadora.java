package br.com.carlosFreitas.recursividade035;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calcNaoRecursivo = Calculadora.fatorialNaoRecursivo(5);
        int calc = Calculadora.fatorial(5);

        System.out.println(calcNaoRecursivo);
        System.out.println(calc);
	}

}
