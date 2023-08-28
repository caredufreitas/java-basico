package br.com.carlosFreitas.exercicios.aula44a46;

public class Quadrado extends Figura2d implements DimensaoSuperficial{

	private double lado;
	private double area;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getArea() {
		return area;
	}

	private void setArea(double area) {
		this.area = area;
	}

	@Override
	public double calcularArea() {
		this.setArea(Math.pow(this.getLado(), 2));
		return this.getArea();
	}
}
