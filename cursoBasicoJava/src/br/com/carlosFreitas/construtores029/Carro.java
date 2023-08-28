package br.com.carlosFreitas.construtores029;

public class Carro {
	//atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //    construtor simples e vazio
    Carro(){
        System.out.println("Classe carro foi instânciada. ");
        this.numPassageiros = 4;
    }
    // construtor com parametro
    Carro(String marca_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        this.marca = marca_;
        this.numPassageiros = numPassageiros_;
        this.capCombustivel = capCombustivel_;
        this.consumoCombustivel = consumoCombustivel_;
    }

    //      metodos como bloco de código
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km.");
    }
    /*
        metodo com retorno, em método sempre se inicia a palavra com um verbo, no final a declaração do retorno aonde no inicio
        odemos colocar outro tipo de lógica.
    */
    double obterAutonomia(){
        System.out.println("Método com retorno foi chamado! ");
        return capCombustivel * consumoCombustivel;
    }

    /*
     * Métodos com parametros
     * */
    double calcularCombustivel(double km){
        return this.consumoCombustivel / km ;
    }
}
