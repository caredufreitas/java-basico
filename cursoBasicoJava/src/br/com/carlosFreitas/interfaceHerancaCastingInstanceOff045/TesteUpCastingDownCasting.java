package br.com.carlosFreitas.interfaceHerancaCastingInstanceOff045;

public class TesteUpCastingDownCasting {

	public static void main(String[] args) {

		/*
			Aluno aluno = new Aluno();
			Pessoa pessoaAluno = aluno; // upcasting pois Pessoa est� acima da �rvore

			Pessoa aluno02 = (Pessoa) new Aluno();
		  	c�digos que trabalha muito com acesso a BD usam muito o tipo de upcasting
		  	principalmente o hibernate.
		 */
//		Pessoa pessoa = new Pessoa();
//		Aluno aluno = (Aluno) pessoa; // downcasting, a IDE vai dar um erro e para fazer o downcasting fazer manualmente (Aluno)
		/*
		 *  o problema vai ser em executar, vai ter um erro de ClassCastException, Pessoa n�o pode converter para Aluno
		 *  erro de convers�o de classe, existe uma solu��o m�s em geral pode ter alguns problemas.
		 *  Devido o conte�do de atributos.
		 */		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		if(pessoa instanceof Pessoa) {
			System.out.println("� do tipo Professor");
		}
		if(aluno instanceof Aluno) {
			System.out.println("� do tipo Aluno");
		}
		if(professor instanceof Professor) {
			System.out.println("� do tipo Professor");
		}
		
	}
}

