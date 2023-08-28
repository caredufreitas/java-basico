package br.com.carlosFreitas.contaCorrente;

public class TesteContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente c1 = new ContaCorrente();
        c1.nuConta = 01;
        c1.saque(500);
        c1.deposito(5000);
        c1.descricao();
	}

}
