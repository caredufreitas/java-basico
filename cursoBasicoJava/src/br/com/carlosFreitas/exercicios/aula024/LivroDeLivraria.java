package br.com.carlosFreitas.exercicios.aula024;

public class LivroDeLivraria {

	String oferta;

	void opcao(Livro livro){
		if(livro.categoria.equals("Livro")){
			this.oferta = "Não temos oferta para este tipo! ";
		}else if(livro.categoria.equals("eBooks")){
			this.oferta = "Opa! está todos em oferta. ";
		}else if(livro.categoria.equals("Sebo")){
			this.oferta = "Opa! está todos em oferta. ";
		}
		System.out.println("Preparou para você: " + this.oferta);
		System.out.println("========================================");
		livro.descricao();
	}

}
