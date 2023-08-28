package br.com.carlosFreitas.herancaSobrecargaMetodo040;

public class Aluno extends Pessoa{
	private String curso;
	private double[] notas;
	
	public Aluno() {}
		
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
		/*
		 * fazendo refer�ncia a classe Super com this O Super sempre utilizamos quando
		 * vamos fazer acesso a Super Classe
		 */
	}


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
	
	public void metodoQualquer() {
		/* this. ctrl + space ele vai mostrar no intelicence todos os metodos de acesso disponiv�is 
		 * da classe filha incluindo os da classe Super por heran�a;
		 *  super. ctrl + space ele vai mostrar no intelicence somente os metodos de acesso disponiv�is
		 *  da Super classe e por padr�o ele estende Object, vai aparecer algumas op��es da mesma.
		 *  */
		
	}

	/*
	 * O triangulo do lado do metodo, tool type 
	 * overrides br.com.carlosFreitas.herancaPolimorfismoSobrecargaDeMetodos040.Pessoa.obterEtiquetaEndereco
	 * Ou seja estou s� sobrescrevendo, sobrepondo e modificando o conteudo dele.
	 * Quando for chamado por uma inst�ncia de aluno ele passar� a ser chamado pela classe Aluno.
	 */
	public String obterEtiquetaEndereco() {
		/*
		 * modificando assinatura do metodo da super classe
		 */
		String s = "Endere�o do Aluno";
		s += super.getEndereco(); // concatenando com endereco da Super classe
		return s;
	}
}
