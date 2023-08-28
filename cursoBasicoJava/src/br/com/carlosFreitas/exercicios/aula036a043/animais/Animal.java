package br.com.carlosFreitas.exercicios.aula036a043.animais;

public class Animal {
	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal() {
		this.patas = 4;
	}
	
	public Animal(String cor) {
		super();
		this.cor = cor;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
//		converte kilometro para metro
		double m = velocidade * 1000;
//		converte metro para metro por segundo, 1 hora tem 60 min, 60 min tem 60 seg, 60 x 60 = 3.600
		double ms = m / 3.600;
		this.velocidade = ms;
	}
}
