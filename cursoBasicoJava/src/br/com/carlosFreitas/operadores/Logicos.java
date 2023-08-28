package br.com.carlosFreitas.operadores;
/*
* & - AND
* | - OR
* && - AND (curto circuito)
* || - OR (curto circuito)
* ! - Not
* ^ - XOR
* */
public class Logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor01 = 1;
        int valor02 = 2;

        boolean resultado01 = (valor01 == 1) && (valor02 == 2);
        System.out.println("Valor01 é 1 AND valor02 é 2 - resultado: " + resultado01);
        boolean resultado02 = (valor01 == 1) || (valor02 == 2);
        System.out.println("Valor01 é 1 OR Valor02 é 2 - resultado: " + resultado02);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso); //condicao para dar verdadeiro é verdadeiro AND verdadeiro | falso AND falso
        System.out.println(!verdadeiro && falso);
	}

}
