package br.com.carlosFreitas.exercicios.aula019;

public class QuantidadeParesNoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 3, 7, 6, 10, 11, 45, 78, 66, 93};
        int totPares = 0;

        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                System.out.print(a[i] + ", ");
                totPares++;
            }
        }
        System.out.println("\nExistem o total de " + totPares+ " números pares. ");
	}

}
