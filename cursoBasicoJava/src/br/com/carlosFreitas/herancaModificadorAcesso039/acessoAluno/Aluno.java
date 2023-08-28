package br.com.carlosFreitas.herancaModificadorAcesso039.acessoAluno;

import br.com.carlosFreitas.herancaModificadorAcesso039.Pessoa;

public class Aluno extends Pessoa{
	private String curso;
	private double[] notas;
	
	public Aluno() {}
		
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
		/*
		 * fazendo referência a classe Super com this O Super sempre utilizamos quando
		 * vamos fazer acesso a Super Classe
		 */
	}
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "Teste Público";
		super.nomeVisibilidade = "Teste Público";
		/*
		 * Teste realizado com visibilidade padrão pode ser visualizada e acessada em outro
		 * pacote e classe, devido estar no mesmo pacote.
		 * Teste realidado com visibilidade publica pode ser visualizada e acessada em outro
		 * pacote e classe pois todas tem acesso.
		 * 
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
		/* this. ctrl + space ele vai mostrar no intelicence todos os metodos de acesso disponivéis 
		 * da classe filha incluindo os da classe Super por herança;
		 *  super. ctrl + space ele vai mostrar no intelicence somente os metodos de acesso disponivéis
		 *  da Super classe e por padrão ele estende Object, vai aparecer algumas opções da mesma.
		 *  */
		
	}
}
