package br.com.carlosFreitas.vetores019;
/*
* Vetores é a estrutura de dados mais simples que existe na línguagem
* de programação.
* Lista ordenada de dados.
* */
public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	    temperatura média por 1 ano, solução utilizar um Array, Vetor

		//      precisa indicar o número de posições, criando e inicializando o Array
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;

		System.out.println("O valor da temperatura do dia 1 é " + temperaturas[0]);
		System.out.println("O valor da temperatura do dia 3 é " + temperaturas[3]);
		//      tamanho do Array, é o tamanho que foi definido na inicialização, não quantidade que foi inserido.
		System.out.println("O tamanho do Array " + temperaturas.length);
		//      valores que tem no Array, através doloop
		for (int i = 0; i < temperaturas.length; i++){
			System.out.println("O valor da temperatura ["+ (i + 1)+ "] = " + temperaturas[i]);
		}
		//Foreach, acessar cada posição
		for (double temp: temperaturas) {
			System.out.println(temp);
		}
	}

}
