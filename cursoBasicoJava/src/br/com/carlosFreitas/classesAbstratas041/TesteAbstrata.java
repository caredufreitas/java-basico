package br.com.carlosFreitas.classesAbstratas041;

public class TesteAbstrata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pessoa pessoa = new Pessoa();
		/*
		 * Deu erro, Cannot instantiate the type Pessoa
		 * N�o pode inst�nciar o tipo Pessoa a classe � abstrata
		 * n�o pode ter uma inst�ncia real de Pessoa.
		 */
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
//		pessoa.setEndereco("Rua 01, num 01");
		aluno.setEndereco("Rua 01, num 01");
		professor.setEndereco("Rua 02, num 02");
//			ctrl + alt + seta para baixo, duplica a linha
		/*
		 * System.out.println(aluno.obterEtiquetaEndereco());
		 * System.out.println(professor.obterEtiquetaEndereco());
		 */
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}
	

}
