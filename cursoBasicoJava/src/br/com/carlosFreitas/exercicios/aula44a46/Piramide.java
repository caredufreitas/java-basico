package br.com.carlosFreitas.exercicios.aula44a46;

public class Piramide extends Figura3d{
	
	private int numeroArestaBase;
	private double comprimentoArestaBase;
	private double apotemaLateral;
	private double areaTotal;
	private double volume;
	
	double areaBase = 0;
	
	public int getNumeroArestaBase() {
		return numeroArestaBase;
	}

	public void setNumeroArestaBase(int numeroArestaBase) {
		this.numeroArestaBase = numeroArestaBase;
	}

	public double getComprimentoArestaBase() {
		return comprimentoArestaBase;
	}
	
	public void setComprimentoArestaBase(double comprimentoArestaBase) {
		this.comprimentoArestaBase = comprimentoArestaBase;
	}

	public double getApotemaLateral() {
		return apotemaLateral;
	}

	public void setApotemaLateral(double apotemaLateral) {
		this.apotemaLateral = apotemaLateral;
	}
	
	public double getAreaTotal() {
		return areaTotal;
	}

	private void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public double getVolume() {
		return volume;
	}

	private void setVolume(double volume) {
		this.volume = volume;
	}
	
// calcula area
	@Override
	public double calcularArea() {
		this.setApotemaLateral(this.getNumeroArestaBase() * (this.getComprimentoArestaBase() * this.getApotemaLateral() / 2));
		areaBase = Math.pow(this.getComprimentoArestaBase(), 2);
		this.setAreaTotal(areaBase + this.getApotemaLateral());
		return this.getAreaTotal();
	}
//	calcula volume
	@Override
	public double calcularVolume() {
		this.setVolume(areaBase * this.getComprimentoArestaBase() / 3);
		return this.getVolume();
	}
}
