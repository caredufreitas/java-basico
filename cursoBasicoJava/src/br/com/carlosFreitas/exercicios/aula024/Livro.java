package br.com.carlosFreitas.exercicios.aula024;

public class Livro {
	String titulo;
	String categoria;
	String autor;
	String marca;
	int numPagina;
	double preco;

	void descricao(){
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Autor: " + this.autor);
		System.out.println("Marca: " + this.marca);
		System.out.println("N�mero de p�ginas: " + this.numPagina);
		System.out.println("Pre�o R$: " + this.preco);
		System.out.println("========================================");
	}
}
