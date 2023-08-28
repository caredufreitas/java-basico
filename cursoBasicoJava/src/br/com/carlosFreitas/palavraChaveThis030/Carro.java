package br.com.carlosFreitas.palavraChaveThis030;

public class Carro {
	//atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro() {

    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 paramentros. ");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando o construtor com 2 paramentros. ");
    }


    //      metodos como bloco de código
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km.");
    }

    /*
        metodo com retorno, em método sempre se inicia a palavra com um verbo, no final a declaração do retorno aonde no inicio
        odemos colocar outro tipo de lógica.
    */
    double obterAutonomia() {
        System.out.println("Método com retorno foi chamado! ");
        return this.capCombustivel * this.consumoCombustivel;
    }

    /*
     * Métodos com parametros
     * */
    double calcularCombustivel(double km) {
        return this.consumoCombustivel / km;
    }
}
