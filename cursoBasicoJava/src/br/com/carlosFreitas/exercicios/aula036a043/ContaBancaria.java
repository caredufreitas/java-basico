package br.com.carlosFreitas.exercicios.aula036a043;

public abstract class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;

	protected static String mensagem;

	public ContaBancaria() {
		this.saldo = 0.0;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//	sacar
	public void sacar(double valor) {
		if(valor > this.getSaldo()) {
			ContaBancaria.mensagem = ""
					+ " ";
		}else {
			this.setSaldo(this.getSaldo() - valor);
			ContaBancaria.mensagem = "Operação realizada. ";
		}
	}

	//	depositar
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
}
