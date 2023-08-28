package br.com.carlosFreitas.classesAbstratas041;

public class Professor extends Pessoa{
	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double calcularSalarioLiquido() {
		return 0;
	}
	
//	polimorfismo em real time
	public String obterEtiquetaEndereco() {
		String s = "Endereço Professor, ";
		s += super.getEndereco();
		return s;
	}
	
	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Obtendo endereço Professor. ");
		System.out.println(this.obterEtiquetaEndereco());
	}
}
