package br.com.carlosFreitas.exercicios.aula036a043.impostoDeRenda;

public class PessoaJuridica extends Contribuinte{
	
	private double rendaBruta;
	private final int IMPOSTO = 10;
	
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
//	calcularImposto
	public double calcularImposto() {
		this.setRendaBruta(this.getRendaBruta() - (this.getRendaBruta() * IMPOSTO) / 100);
		return this.getRendaBruta();
	}
}
