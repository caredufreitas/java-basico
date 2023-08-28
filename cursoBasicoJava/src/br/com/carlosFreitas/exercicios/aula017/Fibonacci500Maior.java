package br.com.carlosFreitas.exercicios.aula017;

public class Fibonacci500Maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1 = 0, t2 = 1, t3 = 0;
        System.out.print(t1+ " ");
        System.out.print(t2+ " ");
        for (int i = 3; i < 17; i++){
            t3 = t1 + t2;
            System.out.print(t3+ " ");
            t1 = t2;
            t2 = t3;
        }
	}

}
