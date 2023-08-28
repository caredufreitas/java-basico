package br.com.carlosFreitas.exercicios.aula019;

public class RegrasDeFormacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 22, 36, 48, 53, 69, 77, 81, 94, 100};
        int[] b = {2, 1, 36, 78, 98, 32, 82, 98, 23, 123};
        int tam = a.length;
        int[] c = new int[tam];

        for (int i = 0; i < a.length; i++){
            if(a[i] > b[i]) {
                c[i] = 1;
            }else if(a[i] == b[i]){
                c[i] = 0;
            }else{
                c[i] = -1;
            }
        }
        for (int vetor: c) {
            System.out.print(vetor + " ");
        }
	}

}
