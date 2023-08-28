package br.com.carlosFreitas.classeObjeto043;

import java.util.Arrays;

public class Aluno {
	private String curso;
	private double[] notas;
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
//	polimorfismo em real time
	public String obterEtiquetaEndereco() {
		String s = "Endereço Aluno, ";
		return s;
	}
	
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}
	
//toString	herda de Object
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

//	metodo equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // compara referencia
			return true;
		if (obj == null)
			return false;
		/*
		 * if (getClass() != obj.getClass()) // tipo da classe return false;
		 */
		Aluno other = (Aluno) obj; // casting
		/*
		 * if (curso == null) { if (other.curso != null) return false; } else if
		 * (!curso.equals(other.curso)) // compara o valor dos atributos return false;
		 * if (!Arrays.equals(notas, other.notas)) // compara o valor dos atributos
		 * return false;
		 */
//		controlando equals
		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		
		return false;
	}
	

}
