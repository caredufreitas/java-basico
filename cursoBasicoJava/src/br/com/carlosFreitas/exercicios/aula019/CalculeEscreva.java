package br.com.carlosFreitas.exercicios.aula019;

public class CalculeEscreva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 34 ,52, 1, 13, 78, 90, 54, 23, 87};
		int somaInferior = 0, somaIgual = 0, somaSuperior = 0, i = 0;
		double media = 0;

		for (int vetor: a) {
			//            soma inferiores
			if(vetor < 15){
				somaInferior++;
			}
			//            soma iguais
			if(vetor == 15){
				somaIgual++;
			}
			if(vetor > 15){
				somaSuperior++;
				i++;
			}
		}
		media = somaSuperior / i;
		System.out.println("\nA soma dos números inferiores á 15 são: " + somaInferior);
		System.out.println("A soma dos números iguais a 15 são: " + somaIgual);
		System.out.println("A média dos números superiores a 15 são: " + media);
	}

}
