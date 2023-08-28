package br.com.carlosFreitas.exercicios.aula019;

public class VetorBmultiplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 6, 8, 10, 12, 14, 16};
        int[] b = new int[8];
//        produto por 2
        for (int i = 0; i < a.length; i++){
            b[i] = a[i] * 2;
            System.out.print(b[i] + ", ");
        }
	}

}
