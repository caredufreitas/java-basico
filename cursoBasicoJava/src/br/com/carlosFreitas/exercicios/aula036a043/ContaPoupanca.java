package br.com.carlosFreitas.exercicios.aula036a043;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;
	final int TAXA_RENDIMENTO = 2;
	
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
//	calcularNovoSaldo
	public void novoSaldo(double valor) {
		if(this.getDiaRendimento() == 15) {
			super.setSaldo((super.getSaldo() + (this.getSaldo() * TAXA_RENDIMENTO) / 100));
		}
	}
}
