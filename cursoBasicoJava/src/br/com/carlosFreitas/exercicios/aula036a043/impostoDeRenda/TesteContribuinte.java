package br.com.carlosFreitas.exercicios.aula036a043.impostoDeRenda;

public class TesteContribuinte {

	public static void main(String[] args) {
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Pessoa Juridica. ");
		pj.setRendaBruta(3000);
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Pessoa Fisica. ");
		pf.setRendaBruta(5000);
//		pj
		System.out.println(pj.getNome());
		System.out.println(pj.getRendaBruta());
		System.out.println(pj.calcularImposto());
//		pf
		System.out.println(pf.getNome());
		System.out.println(pf.getRendaBruta());
		System.out.println(pf.calcularImposto());
		System.out.println(pf.getParcela());
		
	}

}
