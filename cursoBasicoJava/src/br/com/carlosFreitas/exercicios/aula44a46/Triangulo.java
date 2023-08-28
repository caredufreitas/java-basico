package br.com.carlosFreitas.exercicios.aula44a46;

public class Triangulo extends Figura2d implements DimensaoSuperficial{

	private double base;
	private double altura;
	private double area;

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArea() {
		return area;
	}
	private void setArea(double area) {
		this.area = area;
	}

	@Override
	public double calcularArea() {
		this.setArea(this.getBase() * this.getAltura() / 2);
		return this.getArea();
	}

}
