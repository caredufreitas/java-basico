package br.com.carlosFreitas.visibilidadePublicPrivate031;

public class Carro {
	 //atributos
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    private double consumoCombustivel;

    //      metodos como bloco de c�digo
    public void exibirAutonomia() {
        System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " Km.");
    }
    /*
        metodo com retorno, em m�todo sempre se inicia a palavra com um verbo, no final a declara��o do retorno aonde no inicio
        odemos colocar outro tipo de l�gica.
    */

    public double obterAutonomia() {
        System.out.println("M�todo com retorno foi chamado! ");
        return this.capCombustivel * this.consumoCombustivel;
    }

    //uma regra de negocio visto somente nesta classe para organizar o meu c�digo
    private double dividirKmPorConsumoCombustivel(double km){
        return this.consumoCombustivel / km;
    }

    // M�todos com parametros
    public double calcularCombustivel(double km) {
        return this.dividirKmPorConsumoCombustivel(km);
    }
}
