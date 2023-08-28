package br.com.carlosFreitas.interfaces044;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
	
	private String raca;
	
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
