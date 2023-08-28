package br.com.carlosFreitas.exercicios.aula44a46;

public class Cilindro extends Figura3d{
	
	private int altura;
	private double raio;
	private double areaTotal;
	private double volume;
	
	final double PI = 3.14;
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
//	calcula area
	@Override
	public double calcularArea() {
		this.setAreaTotal(PI * Math.pow(this.getRaio(), 2) * this.getAltura());
		return this.getAreaTotal();
	}
//	calcula volume
	@Override
	public double calcularVolume() {
		this.setVolume(2 * PI * this.getRaio() * (this.getAltura() + this.getRaio()));
		return this.getVolume();
	}
}
