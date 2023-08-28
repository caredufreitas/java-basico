package br.com.carlosFreitas.exercicios.aula036a043.impostoDeRenda;

public class PessoaFisica extends Contribuinte{

	private double rendaBruta;
	private double parcela;

	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	public double getParcela() {
		return parcela;
	}
	public void setParcela(double parcela) {
		this.parcela = parcela;
	}

	//	calcularImposto
	public double calcularImposto() {
		if(this.getRendaBruta() > 0 && this.getRendaBruta() < 1401) {
			this.setRendaBruta(this.getRendaBruta());
			this.setParcela(0);
		}else if(this.getRendaBruta() > 1400.01 && this.getRendaBruta() < 2101) {
			this.setRendaBruta(this.getRendaBruta() - (this.getRendaBruta() * 10) / 100);
			this.setParcela(100);
		}else if(this.getRendaBruta() > 2100.01 && this.getRendaBruta() < 2801) {
			this.setRendaBruta(this.getRendaBruta() - (this.getRendaBruta() * 15) / 100);
			this.setParcela(270);
		}else if(this.getRendaBruta() > 2800.01 && this.getRendaBruta() < 3601) {
			this.setRendaBruta(this.getRendaBruta() - (this.getRendaBruta() * 25) / 100);
			this.setParcela(500);
		}else if(this.getRendaBruta() > 3600.01) {
			this.setRendaBruta(this.getRendaBruta() - (this.getRendaBruta() * 30) / 100);
			this.setParcela(700);
		}
		return this.getRendaBruta();
	}
}
