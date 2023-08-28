package br.com.carlosFreitas.exercicios.aula028a033;

public class TesteContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente();
		cc.setNumero(50);
		cc.setSaldo(500.0);
		//        System.out.println(cc.sacar(50.0));
		System.out.println(cc.consultarSaldo());
		System.out.println(cc.getStatus());
	}

}
