package br.com.carlosFreitas.finalConstantes042;

public class TesteFinalConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		/*
		 * Pessoa aluno = new Aluno(); Pessoa professor = new Professor();
		 * Agora não podemos ter mais está instância da super classe Pessoa do tipo Aluno
		 * 
		 */
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
//		somente instância do mesma classe e mesmo tipo
		
//		exemplo 02 variáveis constantes
		System.out.println(Constantes.URL_BLOG);
		System.out.println(Constantes.CURSO_COMPLETO);
	}

}
