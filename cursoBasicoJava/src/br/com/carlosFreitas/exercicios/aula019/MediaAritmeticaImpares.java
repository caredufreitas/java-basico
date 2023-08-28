package br.com.carlosFreitas.exercicios.aula019;

public class MediaAritmeticaImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2 ,3 , 9, 4, 12, 15, 67, 13, 88, 93};
		int soma = 0, i = 0;
		double media = 0;

		for (int vetor: a) {
			if(vetor % 2 == 1){
				System.out.print(vetor + ", ");
				soma += vetor;
				i++;
			}
		}
		media = soma / i;
		System.out.println("\nA média aritmética é ("+ media+"). ");
	}

}
