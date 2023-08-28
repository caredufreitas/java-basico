package br.com.carlosFreitas.exercicios.aula44a46;

public class Cubo extends Figura3d{
	
	private double aresta;
	private double area;
	private double volume;

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	public double getArea() {
		return area;
	}

	private void setArea(double area) {
		this.area = area;
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
		this.setArea(Math.pow(this.getAresta(), 2) * 6);
		return this.getArea();
	}
	
// calcula volume
	@Override
	public double calcularVolume() {
		this.setVolume(this.getArea() * this.getAresta());
		return this.getVolume();
	}
}
