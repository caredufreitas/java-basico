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
		System.out.println("Tens�o: " + this.tensao);
		System.out.println("Pre�o: " + this.precao);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Total R$: " + this.total);
	}
}
