package br.com.carlosFreitas.exercicios.aulaPOO_024;

public class Lampada {
	// atributos
	String tipo;
	int tensao;
	double precao;
	int quantidade;
	double total;

	//    metodos
	void total(){
		this.total = quantidade * precao;
	}

	void descricao(){
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Tensão: " + this.tensao);
		System.out.println("Preço: " + this.precao);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Total R$: " + this.total);
	}
}
