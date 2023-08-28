package br.com.carlosFreitas.vetores019;
/*
* Vetores � a estrutura de dados mais simples que existe na l�nguagem
* de programa��o.
* Lista ordenada de dados.
* */
public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	    temperatura m�dia por 1 ano, solu��o utilizar um Array, Vetor

		//      precisa indicar o n�mero de posi��es, criando e inicializando o Array
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;

		System.out.println("O valor da temperatura do dia 1 � " + temperaturas[0]);
		System.out.println("O valor da temperatura do dia 3 � " + temperaturas[3]);
		//      tamanho do Array, � o tamanho que foi definido na inicializa��o, n�o quantidade que foi inserido.
		System.out.println("O tamanho do Array " + temperaturas.length);
		//      valores que tem no Array, atrav�s doloop
		for (int i = 0; i < temperaturas.length; i++){
			System.out.println("O valor da temperatura ["+ (i + 1)+ "] = " + temperaturas[i]);
		}
		//Foreach, acessar cada posi��o
		for (double temp: temperaturas) {
			System.out.println(temp);
		}
	}

}
