package br.com.carlosFreitas.exercicios.aula017;

public class LojaArtigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PRECOFIXO = 1.99;
        int i = 1;
        System.out.println("*** Lojas Quase Dois - Tabela de Preços ***");
        do {
            double precoAtual = i * PRECOFIXO;
            System.out.println("["+ i+ "]=R$: "+ precoAtual);
            i++;
        }while(i < 51);
        System.out.println("*****************************************");
	}

}
