package br.com.carlosFreitas.construtores029;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

//        System.out.println(van.numPassageiros);

//        inicializando classe com todos os parametros
        Carro van2 = new Carro(
                "Fiat",
                10,
                100,
                0.4);
        van2.modelo = "Ducato";
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustivel);
        System.out.println(van2.consumoCombustivel);
	}

}
