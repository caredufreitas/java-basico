package br.com.carlosFreitas.exercicios.aula024;

public class LivroDeLivraria {

	String oferta;

	void opcao(Livro livro){
		if(livro.categoria.equals("Livro")){
			this.oferta = "N�o temos oferta para este tipo! ";
		}else if(livro.categoria.equals("eBooks")){
			this.oferta = "Opa! est� todos em oferta. ";
		}else if(livro.categoria.equals("Sebo")){
			this.oferta = "Opa! est� todos em oferta. ";
		}
		System.out.println("Preparou para voc�: " + this.oferta);
		System.out.println("========================================");
		livro.descricao();
	}

}
