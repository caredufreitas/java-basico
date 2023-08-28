package br.com.carlosFreitas.exercicios.aula019;

public class RestoDaDivisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 3, 6, 9, 10, 13, 14, 17, 18, 21};
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++){
            b[i] = a[i] % 2;
            System.out.print(b[i] + ", ");
        }
	}

}
