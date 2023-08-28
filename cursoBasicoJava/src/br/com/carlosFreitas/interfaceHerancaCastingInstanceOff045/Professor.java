package br.com.carlosFreitas.interfaceHerancaCastingInstanceOff045;

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

	/*
	 * 
	 * Apenas sobrescrevendo o metodo da super classe polimorfismo.
	 * quando for chamado o metodo por uma instância de professor ele vai ser 
	 * chamado pela classe do professor
	 * 
	 */
	public String obterEtiquetaEndereco() {
		/*
		 * modificando assinatura do metodo da super classe
		 */
		String s = "Endereço do Professor";
		s += super.getEndereco(); // concatenando com endereco da Super classe
		return s;
	}
}
