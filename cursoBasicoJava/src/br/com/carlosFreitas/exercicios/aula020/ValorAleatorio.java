package br.com.carlosFreitas.exercicios.aula020;

public class ValorAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[4][4];

		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				m[i][j] = (int) Math.round(Math.random() * 9);
			}
		}
		int maior = 0;
		int li = 0;
		int col = 0;

		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + " ");
				if(m[i][j] > maior){
					maior = m[i][j];
					li = i;
					col = j;
				}
			}
			System.out.println();
		}
		System.out.println("=================");
		System.out.println("Maior: " + maior);
		System.out.println("Linha: " + li);
		System.out.println("Coluna: " + col);
	}

}
