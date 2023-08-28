package br.com.carlosFreitas.exercicios.aula025a027;

public class executaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno();
        a1.nome = "Carlos Eduardo de Freitas";
        a1.matricula = 2021;
        a1.curso = "Sitema de Informação";
        a1.disciplina01 = "Arquitetura de Computadores";
        a1.disciplina02 = "Lógica de Programação";
        a1.disciplina03 = "Laboratório de Informatica";
        a1.nota01 = 8.0;
        a1.nota02 = 5.0;
        a1.nota03 = 2.0;

        System.out.println(a1.verificarAluno(a1.disciplina01, a1.nota01));
	}

}
