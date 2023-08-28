package br.com.carlosFreitas.exercicios.aula019;

public class Par0Impar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int tam = a.length;
		int[] b = new int[tam];

		for(int i = 0; i < a.length; i++){
			if(a[i] % 2 == 0){
				b[i] = 1;
			}else{
				b[0] = 0;
			}
		}
		for (int vetor: b) {
			System.out.print(vetor + " ");
		}
	}

}
