package br.com.carlosFreitas.heranca037;

public class TesteHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		Professor professor = new Professor(); // classe do tipo
		Pessoa pessoa = new Professor(); // declarando a super classe
		
		aluno.setNome("Maria");
		System.out.println(aluno.getNome());
		professor.setTelefone("Celular");
		System.out.println(professor.getTelefone());
	}

}
