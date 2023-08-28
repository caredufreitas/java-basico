package br.com.carlosFreitas.classeEmetodoSimples025;

public class Carro {
	//atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

//metodos como bloco de c�digo
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
