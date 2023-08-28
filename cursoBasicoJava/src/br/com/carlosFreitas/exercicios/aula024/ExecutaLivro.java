package br.com.carlosFreitas.exercicios.aula024;

public class ExecutaLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro l1 = new Livro();
		l1.titulo = "Razão e Sensibilidade, Orgulho e Preconceito, Persuasão - Brochura";
		l1.categoria = "Livro";
		l1.marca = "Martin Claret";
		l1.autor = "Austen, Jane";
		l1.numPagina = 500;
		l1.preco = 80.0;

		Livro l2 = new Livro();
		l2.titulo = "Homenagem a catalunha";
		l2.categoria = "eBooks";
		l2.marca = "Blá Blá Blá";
		l2.autor = "George Orwell";
		l2.numPagina = 50;
		l2.preco = 64.90;

		Livro l3 = new Livro();
		l3.titulo = "Nada ortodoxa";
		l3.categoria = "Sebo";
		l3.marca = "Sei de quem";
		l3.autor = "Deborah Feldman";
		l3.numPagina = 10;
		l3.preco = 42.0;

		LivroDeLivraria loja = new LivroDeLivraria();
		loja.opcao(l2);
		LivroDeBiblioteca emprestar = new LivroDeBiblioteca();
		emprestar.emprestar(l2);
	}

}
