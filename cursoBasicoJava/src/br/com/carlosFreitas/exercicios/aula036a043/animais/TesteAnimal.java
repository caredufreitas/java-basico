package br.com.carlosFreitas.exercicios.aula036a043.animais;

public class TesteAnimal {

	public static void main(String[] args) {
		Peixe p = new Peixe();
		p.setNome("Palhaço");
		p.setComprimento(0.2);
		p.setAmbiente("Mar");
		p.setCaracteristica("Barbatanas e cauda");
		
		Urso u = new Urso();
		u.setNome("Americano");
		u.setComprimento(2.30);
		u.setCor("Castanho");
		u.setAlimento("Mel");
		u.setVelocidade(2);
		
		System.out.println(p.toString());
		System.out.println(u.toString());
		
	}

}
