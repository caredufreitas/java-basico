package br.com.carlosFreitas.exercicios.aula036a043;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Ana");
		contaPoupanca.setNumConta(11111);
		contaPoupanca.setSaldo(500);
		contaPoupanca.setDiaRendimento(15);
		contaPoupanca.depositar(1000);
		contaPoupanca.sacar(330);
		
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Maria");
		contaEspecial.setNumConta(22222);
		contaEspecial.setSaldo(300);
		contaEspecial.setLimite(500);
		contaEspecial.depositar(500);
		contaEspecial.sacar(900);
		
		System.out.println(contaPoupanca.getNomeCliente());
		System.out.println(contaPoupanca.getNumConta());
		System.out.println(contaPoupanca.getSaldo());
		System.out.println("Sacar: " + ContaBancaria.mensagem);
		System.out.println("=================================");
		System.out.println(contaEspecial.getNomeCliente());
		System.out.println(contaEspecial.getNumConta());
		System.out.println(contaEspecial.getSaldo());
		System.out.println("Sacar: " + ContaEspecial.mensagem);
		System.out.println(contaEspecial.getLimite());
	}

}
