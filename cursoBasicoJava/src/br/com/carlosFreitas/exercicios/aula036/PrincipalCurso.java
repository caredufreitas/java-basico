package br.com.carlosFreitas.exercicios.aula036;

import java.util.Scanner;

public class PrincipalCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double nota = 0;
		double[] notas = new double[4];
		Aluno aluno01 = new Aluno();
		aluno01.setNome("Marcos");
		aluno01.setMatricula(1);
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno(a) " + aluno01.getNome() + ": ");
			nota = scan.nextDouble();
			notas[i] = nota;
		}
		aluno01.setNotas(notas);

		Aluno aluno02 = new Aluno();
		aluno02.setNome("André");
		aluno02.setMatricula(2);
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno(a) " + aluno02.getNome() + ": ");
			nota = scan.nextDouble();
			notas[i] = nota;
		}
		aluno02.setNotas(notas);

		Aluno aluno03 = new Aluno();
		aluno03.setNome("Ana");
		aluno03.setMatricula(3);
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno(a) " + aluno03.getNome() + ": ");
			nota = scan.nextDouble();
			notas[i] = nota;
		}
		aluno03.setNotas(notas);

		Aluno aluno04 = new Aluno();
		aluno04.setNome("Paula");
		aluno04.setMatricula(4);
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno(a) " + aluno04.getNome() + ": ");
			nota = scan.nextDouble();
			notas[i] = nota;
		}
		aluno04.setNotas(notas);

		Aluno aluno05 = new Aluno();
		aluno05.setNome("Carlos");
		aluno05.setMatricula(5);
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno(a) " + aluno05.getNome() + ": ");
			nota = scan.nextDouble();
			notas[i] = nota;
		}
		aluno05.setNotas(notas);

		Aluno[] alunos = new Aluno[5];
		alunos[0] = aluno01;
		alunos[1] = aluno02; 
		alunos[2] = aluno03; 
		alunos[3] = aluno04; 
		alunos[4] = aluno05;

		Curso curso = new Curso();
		curso.setNome("Sistemas de Informação");
		curso.setHorario("20:00");
		curso.setAlunos(alunos);
		//	saida
		System.out.println("=========== Curso ===========");
		System.out.println("Nome Curso: " + curso.getNome());
		System.out.println("Horário: " + curso.getHorario());
		System.out.println("=========== Alunos ===========");
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
			System.out.println("Matricula: " + a.getMatricula());	
			System.out.println("Média: " + a.getMedia());
			System.out.println("Situação: " + a.getSituacoes());
			System.out.println("==============================");
		}
		for (double n : aluno01.getNotas()) {

		}
	}

}
