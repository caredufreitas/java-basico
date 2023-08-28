package br.com.carlosFreitas.herancaSobrecargaMetodo040;

public class TesteHerancaSobrecargaMetodo {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 01, num 01");
		aluno.setEndereco("Rua 02, num 02");
		professor.setEndereco("Rua 03, num 03");
//		alt + shift + R -> multipla selecao
//		ctrl + f6 -> navegar entre abas abertas
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco()); //chama o metodo a partir da classe Aluno
		System.out.println(professor.obterEtiquetaEndereco()); //chama o metodo a partir da classe Professor
	}
}
