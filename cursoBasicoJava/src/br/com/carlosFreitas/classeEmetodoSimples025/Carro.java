package br.com.carlosFreitas.classeEmetodoSimples025;

public class Carro {
	//atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

//metodos como bloco de código
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
