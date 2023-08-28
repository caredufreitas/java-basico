package br.com.carlosFreitas.exercicios.aula019;

public class SomaMultiplos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2 ,5 ,1 , 15, 23, 45, 72, 89, 11, 4};
        int totMultiplos = 0;

        for (int vetor: a) {
            if(vetor % 5 == 0){
                System.out.print(vetor + ", ");
                totMultiplos++;
            }
        }
        System.out.println("\nO total da soma multiplos de (5) são "+ totMultiplos+ ". ");
	}

}
