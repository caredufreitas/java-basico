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
		System.out.println("Número de páginas: " + this.numPagina);
		System.out.println("Preço R$: " + this.preco);
		System.out.println("========================================");
	}
}
