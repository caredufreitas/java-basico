package br.com.carlosFreitas.finalConstantes042;

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
		String s = "Endere�o Aluno, ";
//		s += super.getEndereco();
		return s;
	}
	
//	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}
}
