package br.com.carlosFreitas.exercicios.aula036a043.animais;

public class Peixe extends Animal{
	
	private String caracteristica;
	
	public Peixe() {
		super.setCor("Cinzenta");
		super.setPatas(0);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		return "Peixe [getCaracteristica()=" + getCaracteristica()
				+ "\n getNome()=" + getNome() + "\n getComprimento()=" + getComprimento() + "\n getPatas()=" + getPatas()
				+ "\n getCor()=" + getCor() + "\n getAmbiente()=" + getAmbiente() + "\n getVelocidade()=" + getVelocidade()
				+ "]";
	}
	
	
	
}
