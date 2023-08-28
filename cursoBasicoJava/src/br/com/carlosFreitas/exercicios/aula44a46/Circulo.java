package br.com.carlosFreitas.exercicios.aula44a46;

public class Circulo extends Figura2d implements DimensaoSuperficial{
	
	private double raio;
	private double area;
	final double PI = 3.14;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getArea() {
		return area;
	}

	private void setArea(double area) {
		this.area = area;
	}

	@Override
	public double calcularArea() {
		this.setArea(PI * Math.pow(this.getRaio(), 2));
		return this.getArea();
	}

}
