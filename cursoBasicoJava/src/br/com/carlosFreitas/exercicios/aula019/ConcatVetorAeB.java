package br.com.carlosFreitas.exercicios.aula019;

public class ConcatVetorAeB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        b = a.clone();
        for (int vetorB: b) {
            System.out.println("Cópia de A para B: " + vetorB);
        }
	}

}
