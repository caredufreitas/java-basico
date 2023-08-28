package br.com.carlosFreitas.exercicios.aula028a033;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] disciplinas = new String[3];
		disciplinas[0] = "Estrutura de dados";
		disciplinas[1] = "Lógica de Programação";
		disciplinas[2] = "Laboratório de Informatica";
		double[] notas = new double[3];
		notas[0] = 5.0;
		notas[1] = 7.0;
		notas[2] = 8.0;

		Aluno a1 = new Aluno();
		a1.setNome("Carlos Eduardo de Freitas");
		a1.setMatricula(1234567890);
		a1.setCurso("Sistemas de Informação");
		a1.setDisciplinas(disciplinas);
		a1.setNotas(notas);
		System.out.println(a1.verificarAprovacaoAluno(notas[2]));
		System.out.println(a1.toString());
	}

}
