package br.com.carlosFreitas.exercicios.aula024;

public class LivroDeBiblioteca {
	boolean emprestado = true;

    void emprestar(Livro livro){
        if(livro.categoria.equals("Livro")){
            this.emprestado = false;
        }else if(livro.categoria.equals("eBooks")){
            this.emprestado = true;
        }else if(livro.categoria.equals("Sebo")){
            this.emprestado = false;
        }
        if(this.emprestado){
            System.out.println(livro.categoria + " não pode ser emprestado! ");
        }
    }
}
