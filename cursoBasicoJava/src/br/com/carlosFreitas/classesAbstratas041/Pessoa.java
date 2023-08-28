package br.com.carlosFreitas.classesAbstratas041;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract String obterEtiquetaEndereco();
	
	public abstract void imprimirEtiquetaEndereco();
	/*
	 * a partir do momento que declaramos a assinatura do método 
	 * na classe Pessoa e o método também tem a assinatura abstrata
	 * isto vai fazer ambas as subclasses de erro e o erro vai ser
	 * exatamente que as subclasses precisem declarar este método.
	 */
}
