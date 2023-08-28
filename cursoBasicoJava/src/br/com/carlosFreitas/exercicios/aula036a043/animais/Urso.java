package br.com.carlosFreitas.exercicios.aula036a043.animais;

public class Urso extends Mamifero{
	
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return "Urso [getAlimento()=" + getAlimento() + "\n getNome()=" + getNome() + "\n getComprimento()="
				+ getComprimento() + "\n getPatas()=" + getPatas() + "\n getCor()=" + getCor() + "\n getAmbiente()="
				+ getAmbiente() + "\n getVelocidade()=" + getVelocidade() + "]";
	}
	
	
}
