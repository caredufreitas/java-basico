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
        System.out.println("Classe carro foi inst�nciada. ");
        this.numPassageiros = 4;
    }
    // construtor com parametro
    Carro(String marca_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        this.marca = marca_;
        this.numPassageiros = numPassageiros_;
        this.capCombustivel = capCombustivel_;
        this.consumoCombustivel = consumoCombustivel_;
    }

    //      metodos como bloco de c�digo
    void exibirAutonomia(){
        System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km.");
    }
    /*
        metodo com retorno, em m�todo sempre se inicia a palavra com um verbo, no final a declara��o do retorno aonde no inicio
        odemos colocar outro tipo de l�gica.
    */
    double obterAutonomia(){
        System.out.println("M�todo com retorno foi chamado! ");
        return capCombustivel * consumoCombustivel;
    }

    /*
     * M�todos com parametros
     * */
    double calcularCombustivel(double km){
        return this.consumoCombustivel / km ;
    }
}
