package br.com.carlosFreitas.exercicios.aula028a033;

import java.util.Arrays;

public class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplinas;
	private double[] notas;

	public Aluno() {
		disciplinas = new String[3];
		notas = new double[3];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		for (int i = 0; i < disciplinas.length; i++){
			this.disciplinas[i] = disciplinas[i];
		}
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		for (int i = 0; i < this.notas.length; i++){
			this.notas[i] = notas[i];
		}
	}

	public String verificarAprovacaoAluno(double nota) {
		String resp = "";
		if(nota >= 7){
			resp = "Aprovado. ";
		}
		return resp;
	}

	@Override
	public String toString() {
		return "Aluno{" +
				"nome='" + nome + '\'' +
				", matricula=" + matricula +
				", curso='" + curso + '\'' +
				", disciplinas=" + Arrays.toString(disciplinas) +
				", notas=" + Arrays.toString(notas) +
				'}';
	}
}
