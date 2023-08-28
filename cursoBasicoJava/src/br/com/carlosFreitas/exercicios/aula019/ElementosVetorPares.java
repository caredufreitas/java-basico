package br.com.carlosFreitas.exercicios.aula019;

public class ElementosVetorPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 6, 8, 10, 13, 23, 78, 90, 18};

        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }else{
                break;
            }
        }
	}

}
