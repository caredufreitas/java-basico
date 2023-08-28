package br.com.carlosFreitas.exercicios.aula019;

public class SomaElementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int soma = 0;

        for (int vetor: a) {
            soma += vetor;
        }
        System.out.print("A soma de todos os elementos são " + soma+ ". ");
	}

}
