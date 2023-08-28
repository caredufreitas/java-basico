package br.com.carlosFreitas.visibilidadePublicPrivate031;

public class Carro {
	 //atributos
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    private double consumoCombustivel;

    //      metodos como bloco de código
    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km.");
    }
    /*
        metodo com retorno, em método sempre se inicia a palavra com um verbo, no final a declaração do retorno aonde no inicio
        odemos colocar outro tipo de lógica.
    */

    public double obterAutonomia() {
        System.out.println("Método com retorno foi chamado! ");
        return this.capCombustivel * this.consumoCombustivel;
    }

    //uma regra de negocio visto somente nesta classe para organizar o meu código
    private double dividirKmPorConsumoCombustivel(double km){
        return this.consumoCombustivel / km;
    }

    // Métodos com parametros
    public double calcularCombustivel(double km) {
        return this.dividirKmPorConsumoCombustivel(km);
    }
}
