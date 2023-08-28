package br.com.carlosFreitas.exercicios.aula036a043;

public class ContaEspecial extends ContaBancaria{
private double limite;
	
	protected static String mensagem;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	public void sacar(double valor) {
		if(valor > super.getSaldo()) {
			ContaEspecial.mensagem = "Saldo não pode passar a ser negativo. ";
		}else {
			this.setSaldo(this.getSaldo() - valor);
			ContaEspecial.mensagem = "Operação realizada. ";
		}
	}
}
