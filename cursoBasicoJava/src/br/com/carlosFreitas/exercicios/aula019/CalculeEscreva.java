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
		System.out.println("\nA soma dos n�meros inferiores � 15 s�o: " + somaInferior);
		System.out.println("A soma dos n�meros iguais a 15 s�o: " + somaIgual);
		System.out.println("A m�dia dos n�meros superiores a 15 s�o: " + media);
	}

}
