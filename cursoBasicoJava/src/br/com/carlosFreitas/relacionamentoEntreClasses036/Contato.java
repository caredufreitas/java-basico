package br.com.carlosFreitas.relacionamentoEntreClasses036;

public class Contato {
	private String nome;
	//  relcionamento tem muitos
	private Telefone[] telefone;
	//  relacionamento tem um
	private Endereco enderecos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone[] getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}

	public Endereco getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco enderecos) {
		this.enderecos = enderecos;
	}
}
