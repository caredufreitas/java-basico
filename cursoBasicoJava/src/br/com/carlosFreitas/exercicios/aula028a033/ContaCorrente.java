package br.com.carlosFreitas.exercicios.aula028a033;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private String status;
	private double limite;

	public ContaCorrente() {
		this.saldo = 0.0;
		this.limite = -100;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
		this.definirStatus();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	//	    inserirStatus
	public void definirStatus() {
		if(this.getNumero() > 10){
			this.status = "Especial";
		}else{
			this.status = "Comum";
		}
	}
	//	      depositar
	public void depositar(double depositar){
		this.saldo += depositar;
	}
	//	    consularSaldo
	public double consultarSaldo(){
		return this.saldo;
	}
	//	    verificarSaque
	private boolean verificarSaque(double valor){
		boolean resp;
		if(valor > this.saldo){
			resp = false;
		}else{
			resp = true;
		}
		return resp;
	}
	//	    sacar
	public String sacar(double valor){
		String resp = "";
		boolean saque = this.verificarSaque(valor);
		if(saque){
			this.setSaldo(this.getSaldo() - valor);
			resp = "Saque realizado com sucesso! ";
		}else{
			resp = "Não foi possível efetuar operação! Saldo insuficiente.";
		}
		return resp;
	}
}
