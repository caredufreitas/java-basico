package br.com.carlosFreitas.javaBasicoPOO;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 40;
        van.consCombustivel = 0.2;

        Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consCombustivel = 0.15;

        System.out.println(van); //somente o endereço de memória
        System.out.println(van.marca);
        System.out.println(van.modelo);

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
	}

}
