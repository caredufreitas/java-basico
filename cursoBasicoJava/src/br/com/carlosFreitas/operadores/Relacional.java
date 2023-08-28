package br.com.carlosFreitas.operadores;
/*
*  == igual a
*  != diferente de
*  > maior que
*  < menor que
* >= maior ou igual que
* <= menor ou igual que
* */
public class Relacional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 1;
        int v2 = 2;

        System.out.println("Valor01 == Valor02 { " + (v == v2) + " }");
        System.out.println("Valor01 != Valor02 { " + (v != v2) + " }");
        System.out.println("Valor01 > Valor02 { " + (v > v2) + " }");
        System.out.println("Valor01 >= Valor02 { " + (v >= v2) + " }");
        System.out.println("Valor01 = Valor02 { " + (v < v2) + " }");
        System.out.println("Valor01 = Valor02 { " + (v <= v2) + " }");
	}

}
