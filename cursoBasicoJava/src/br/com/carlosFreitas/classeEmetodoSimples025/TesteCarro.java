package br.com.carlosFreitas.classeEmetodoSimples025;

public class TesteCarro {

	public static void main(String[] args) {
		
		 Carro van = new Carro(); // instância
		 van.marca = "Fiat"; // atribuição de valores
		 van.modelo = "Ducato";
		 van.numPassageiros = 10;
		 van.capCombustivel = 100;
		 van.consumoCombustivel = 0.2;

		 Carro fusca = new Carro();
		 fusca.marca = "Volkswagen";
		 fusca.modelo = "Fusca";
		 fusca.numPassageiros = 5;
		 fusca.capCombustivel = 40;
		 fusca.consumoCombustivel = 1.0;

		 //	        van.exibirAutonomia();
		 //	        fusca.exibirAutonomia();
		 //	        metodo com retorno
		 double autonomia = van.obterAutonomia();
		 System.out.println("A autonomia do carro é: " + autonomia);
		 System.out.println("Com chamada do método: " + van.obterAutonomia());

		 //	      metodo com parametro
		 double qtdCombustivel10 = van.calcularCombustivel(10);
		 double qtdCombustivel15 = van.calcularCombustivel(15);
		 System.out.println("Qtd combustivel 10 " + qtdCombustivel10);
		 System.out.println("Qtd combustivel 15 " + qtdCombustivel15);
		
	}

}
