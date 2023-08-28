package br.com.carlosFreitas.exercicios.aula44a46;

public class Principal {
	public static void main(String[] args) {
		Quadrado f1 = new Quadrado();
		f1.setLado(2);
		f1.setNome("Quadrado");
		
		Circulo f2 = new Circulo();
		f2.setRaio(3);
		f2.setNome("Circulo");
		
		Triangulo f3 = new Triangulo();
		f3.setAltura(2);
		f3.setBase(4);
		f3.setNome("Triângulo");
		
		Cubo f4 = new Cubo();
		f4.setAresta(3);
		f4.setNome("Cubo");
		
		Piramide f5 = new Piramide();
		f5.setNumeroArestaBase(4);
		f5.setComprimentoArestaBase(3);
		f5.setApotemaLateral(3);
		f5.setNome("Pirâmide");
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[5];
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		
		for (FiguraGeometrica figura : figuras) {
			System.out.println("--------------------");
			System.out.println(figura.getNome());
//			estrutura de decisão para pegar instância somente da classe Figura2d
			if(figura instanceof Figura2d) {
				Figura2d f2d = (Figura2d) figura;
				System.out.println("Área: " + f2d.calcularArea());
			}
//			estrutura de decisão para pegar instância somente da classe Figura3d
			if(figura instanceof Figura3d) {
				Figura3d f3d = (Figura3d) figura;
				System.out.println("Área: " + f3d.calcularArea());
				System.out.println("Volume: " + f3d.calcularVolume());
			}
		}
	}
}
