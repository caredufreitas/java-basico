package br.com.carlosFreitas.exercicios.aula019;

public class Aleatorio0E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		double zero = 0, um = 0, percentualZero = 0, percentualUm = 0;
		for (int i = 0; i < a.length; i++){
			a[i] = (int) Math.round(Math.random() * 1);
			System.out.print(a[i] + " ");
			if(a[i] == 0){
				zero++;
			}else{
				um++;
			}
		}
		percentualZero = (zero * 10) / 100;
		percentualUm = (um * 10) / 100;
		System.out.println("\nPercentual Zero: " +  String.format("%.2f", percentualZero).replace(",", "."));
		System.out.println("Percentual Um: " + String.format("%.2f", percentualUm).replace(",", "."));
	}

}
