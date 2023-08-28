package br.com.carlosFreitas.interfaces044;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
	
	private double tamanho;
	private String raca;
	
	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String amamentar() {
		return null;
	}

	@Override
	public String emitirSom() {
		return null;
	}

	@Override
	public void brincar() {
		
	}

	@Override
	public void levarPassear() {
		
	}

	@Override
	public void alimentar() {
		
	}

	@Override
	public void levarVeterinario() {
		
	}

	@Override
	public void chamarVeterinario() {
		
	}

	

}
